package model.services;

public interface ServicoPagamentoOnline {
	
	public Double pagarTaxa(double valor);
	public Double pagarJuros(double valor, int mes);

}
