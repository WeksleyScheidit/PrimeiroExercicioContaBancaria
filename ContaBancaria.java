/*
 *                    EXERC�CIO: CONTA BANC�RIA
 * Este banco possui clientes pessoa f�sica e jur�dica;
 * Um cliente pode possuir mais de uma conta;
 * As contas pode ser de dos tipos: Especial e Poupan�a;
 * � poss�vel realizar saques, dep�sitos e transfer�ncias de valores entre contas diferentes
 * @author Weksley Scheidit.
 */


package ExercicioContaBnacaria;
import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		//Declara��o de vari�veis da classe main.
		int    tipo; //Vari�vel que identificar� se o cliente se trata de pessoa f�sica ou jur�dica.
		String nome;
		String endereco;
		String atividade;
		String cnpj;
		String cpf;
		String dia;
		String mes; 
		int    ano;
		String genero;
		int    acessarConta;
		String conta;
		double sacar;
		double transferir;
		
		Scanner acessarEncerrar  = new Scanner (System.in);
		Scanner tipoCliente      = new Scanner (System.in);
		Scanner nomeCliente      = new Scanner (System.in);
		Scanner enderecoCliente  = new Scanner (System.in);
		Scanner atividadeEmpresa = new Scanner (System.in);
		Scanner cnpjEmpresa      = new Scanner (System.in);
		Scanner cpfCliente       = new Scanner (System.in);
		Scanner diaNascimento    = new Scanner (System.in);
		Scanner mesNascimento    = new Scanner (System.in);
		Scanner anoNascimento    = new Scanner (System.in);
		Scanner generoCliente    = new Scanner (System.in);
		Scanner contanumero      = new Scanner (System.in);
		Scanner valorSacar       = new Scanner (System.in);
		Scanner valorTransferir  = new Scanner (System.in);
		

		Conta classeConta = new Conta ();
		Pessoa classePessoa = new Pessoa();
		PessoaFisica classePessoaFisica = new PessoaFisica();
		PessoaJuridica classePessoaJuridica = new PessoaJuridica();
		
		
		System.out.println ("______________________Banco WS S/A______________________");
		System.out.println (""); // Esta fun��o serve para pular uma linha.
		
		System.out.println ("Digite (1) para acessar sua conta ou digite (2) para encerrar a sess�o: ");
		acessarConta = acessarEncerrar.nextInt ();
		
		while ((acessarConta!=1) && (acessarConta!=2)) {
			System.out.println ("O valor digitado � inv�lido!");
			System.out.println (""); // Esta fun��o serve para pular uma linha.
			System.out.println ("Novamente, digite (1) para acessar sua conta ou digite (2) para encerrar a sess�o: "); 
			acessarConta = acessarEncerrar.nextInt ();
		}
		
		if (acessarConta==1) {
			//O cliente se trata de uma Pessoa F�sica ou Jur�dica?
			System.out.println ("Digite (1) para atendimento � Pessoas Jur�dicas ou (2) para atendimento � Pessoas F�sicas: ");
			tipo = tipoCliente.nextInt();
			System.out.println (""); // Esta fun��o serve para pular uma linha.
		
		
			//Estrutura de repeti��o para caso o cliente digite algum n�mero diferente de 1 ou 2.
			while ((tipo!=1) && (tipo!=2)) {
				System.out.println ("O valor digitado � inv�lido!");
				System.out.println (""); // Esta fun��o serve para pular uma linha.
				System.out.println ("Novamente, digite (1) para atendimento � Pessoas Jur�dicas ou (2) para atendimento � Pessoas F�sicas: "); 
				tipo = tipoCliente.nextInt();
			}
		 	
			//Estrutura condicional para saber se a pessoa � F�sica ou jur�dica.
			if (tipo == 1) {
				System.out.println ("Digite o nome da sua empresa: ");
				nome = nomeCliente.nextLine();
				System.out.println ("Digite o CNPJ da sua empresa: ");	
				cnpj = cnpjEmpresa.nextLine();
				System.out.println ("Digite o Endere�o da sua empresa: ");
				endereco = enderecoCliente.nextLine();
				System.out.println ("Digite a atividade da sua empresa: ");
				atividade = atividadeEmpresa.nextLine();
				System.out.println ("Digite o n�mero da sua conta: ");
				conta = contanumero.nextLine();
				System.out.println ("Digite (1) para acessar seu saldo, (2) para realizar saques, (3) para realizar transfer�ncias ou (4) para encessar a sess�o: ");
				tipo = tipoCliente.nextInt();
				
				classePessoa.setNome (nome);
				classePessoaJuridica.setCnpj (cnpj);
				classePessoa.setEndereco (endereco);
				classePessoaJuridica.setAtividade (atividade);
				classeConta.setNumeroConta(conta);
				
				while ((tipo!=1)&&(tipo!=2)&&(tipo!=3)&&(tipo!=4)) {
					System.out.println ("O valor digitado � inv�lido!");
					System.out.println ("Novamente, digite (1) para acessar seu saldo, (2) para realizar saques, (3) para realizar transfer�ncias ou (4) para encessar a sess�o: ");
					tipo = tipoCliente.nextInt();
				}
				
				if (tipo==1) {
					classeConta.mostraSaldo();
				}
				else {
					if(tipo==2) {
						System.out.println ("Qual valor voc� deseja sacar? ");
						sacar = valorSacar.nextDouble();						
						classeConta.setOperacaoSaque(sacar);
					}
					else {
						if (tipo==3) {
							System.out.println ("Qual valor voc� deseja transferir? ");
							transferir = valorTransferir.nextDouble();
							classeConta.setTransferir(transferir);
						}
						else {
							System.out.println ("O Banco WS S/A agradece a sua visita ao nosso sistema!");
						}
					}
				}
				//Relat�rio
				classePessoa.mostraNome();
				classeConta.mostraSaldo();
			}
		
			else {
				System.out.println ("Digite o seu nome completo: ");
				nome = nomeCliente.nextLine();
				System.out.println ("Digite o seu CPF: ");
				cpf = cpfCliente.nextLine();
				System.out.println ("Digite o seu g�nero: ");
				genero = generoCliente.nextLine ();
				System.out.println ("Digite sua data de nascimento: ");
				System.out.println (""); // Esta fun��o serve para pular uma linha.
				System.out.println ("Dia: ");
				dia = diaNascimento.nextLine();
				System.out.println ("M�s: ");
				mes = mesNascimento.nextLine ();
				System.out.println ("Ano: ");
				ano = anoNascimento.nextInt ();
				
				System.out.println ("Digite (1) para acessar seu saldo, (2) para realizar saques, (3) para realizar transfer�ncias ou (4) para encessar a sess�o: ");
				tipo = tipoCliente.nextInt();
				
				classePessoaFisica.setId(cpf);
				classePessoa.setNome (nome);
				classePessoaFisica.setGenero (genero);
				classePessoaFisica.setDiaNascimento (dia);
				classePessoaFisica.setMesNascimento (mes);
				classePessoaFisica.setAnoNascimento (ano);
				
				
				while ((tipo!=1)&&(tipo!=2)&&(tipo!=3)&&(tipo!=4)) {
					System.out.println ("O valor digitado � inv�lido!");
					System.out.println ("Novamente, digite (1) para acessar seu saldo, (2) para realizar saques, (3) para realizar transfer�ncias ou (4) para encessar a sess�o: ");
					tipo = tipoCliente.nextInt();
				}
				
				if (tipo==1) {
					classeConta.mostraSaldo();
				}
				else {
					if(tipo==2) {
						System.out.println ("Qual valor voc� deseja sacar? ");
						sacar = valorSacar.nextDouble();						
						classeConta.setOperacaoSaque(sacar);
					}
					else {
						if (tipo==3) {
							System.out.println ("Qual valor voc� deseja transferir? ");
							transferir = valorTransferir.nextDouble();
							classeConta.setTransferir(transferir);
						}
						else {
							System.out.println ("O Banco WS S/A agradece a sua visita ao nosso sistema!");
						}
					}
				}
				//Relat�rio
				classePessoa.mostraNome();
				classeConta.mostraSaldo();
			}
		}
		
		else {
			System.out.println ("O Banco WS S/A agradece a sua visita ao nosso sistema!");
		}		
	}
}