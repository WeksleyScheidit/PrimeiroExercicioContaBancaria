package ExercicioContaBnacaria;

import java.util.Scanner;

public class Conta {
	//Declara��o de vari�veis.
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
			System.out.println ("Digite (1) para caso seja cliente especial ou (2) para caso seja cliente poupan�a: ");
			comparador = teste.nextInt ();
			while ((comparador!=1)&&(comparador!=2)) {
				System.out.println ("O valor digitado � inv�lido!");
				System.out.println ("Novamente, digite (1) para caso seja cliente especial ou (2) para caso seja cliente poupan�a: ");
				comparador = teste.nextInt ();				
			}
			
			if (comparador==1) {
				saldoCliente = limiteEspecial + saldoCliente;
			}
			else {
				saldoCliente = saldoCliente + (saldoCliente*0.005); //  A poupan�a rende, aproximadamente, 0,5% ao m�s
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
