package model.services;

public class ServicoPaypal implements ServicoPagamentoOnline{
	
	private static final double Percentuagem_Taxa = 0.02;
	private static final double Juros_Mensais = 0.01;

	@Override
	public Double pagarTaxa(double valor) {
		return valor *  Percentuagem_Taxa;
		}

	@Override
	public Double pagarJuros(double valor, int mes) {
		return valor * Juros_Mensais * mes;
		}
	

	
}
