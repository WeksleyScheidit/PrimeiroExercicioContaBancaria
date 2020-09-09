package ExercicioContaBnacaria;

import java.util.Scanner;

public class Conta {
	//Declaração de variáveis.
	private String numeroConta;
	private double saldoCliente;
	private String Localizacao;
	private int comparador;
	private double limite;
	private double limiteEspecial;
	private double transferencia;
	
	public void setNumeroConta (String conta) {
		numeroConta = conta;
	}
	
	public String getNumeroConta () {
		return numeroConta;
	}
	
	public void setOperacaoSaque (double sacar) {
		if (saldoCliente >= sacar) {
			saldoCliente = saldoCliente - sacar;
		}
		else {
			Scanner teste = new Scanner (System.in);
			System.out.println ("Digite (1) para caso seja cliente especial ou (2) para caso seja cliente poupança: ");
			comparador = teste.nextInt ();
			while ((comparador!=1)&&(comparador!=2)) {
				System.out.println ("O valor digitado é inválido!");
				System.out.println ("Novamente, digite (1) para caso seja cliente especial ou (2) para caso seja cliente poupança: ");
				comparador = teste.nextInt ();				
			}
			
			if (comparador==1) {
				saldoCliente = limiteEspecial + saldoCliente;
			}
			else {
				saldoCliente = saldoCliente + (saldoCliente*0.005); //  A poupança rende, aproximadamente, 0,5% ao mês
			}
		}
	}

	
	public double getOperacaoSaque () {
		return saldoCliente;
	}
	
	public void mostraSaldo () {
		System.out.println ("Saldo: "+saldoCliente);
	}
	
	public void setTransferir (double transferir) {
		transferencia = transferir;
	}	
}
