package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Prestacao;

public class ContratoServico {
	
	private ServicoPagamentoOnline onlinePaymentService;
	
	public ContratoServico(ServicoPagamentoOnline onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	public ContratoServico() {
		}
	
	public void processaContrato(Contrato contrato, int mes) {
		double cotaBasica = contrato.getValorContrato() / mes;
        for (int i = 1; i <= mes; i++) {
            Date data = addMonths(contrato.getDataContrato(), i);
            double cotaNova = cotaBasica + onlinePaymentService.pagarJuros(cotaBasica, i);
            double cotaFinal =  cotaNova + onlinePaymentService.pagarTaxa(cotaNova);
            contrato.addPrestacao(new Prestacao(data, cotaFinal));
        }
	}
		
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
