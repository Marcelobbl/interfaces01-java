package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacao;
import model.services.ContratoServico;
import model.services.ServicoPaypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato ");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Digite o numero de parcelas ");
		Integer numeroParcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valor);
		ContratoServico contratoServico = new ContratoServico(new ServicoPaypal());
		contratoServico.processaContrato(contrato, numeroParcelas);
		
		System.out.println("Parcelas:");
		for (Prestacao x : contrato.getPrestacoes()) {
			System.out.println(x);
		}
		sc.close();
	}

}
