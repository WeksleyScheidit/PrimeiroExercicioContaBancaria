package ExercicioContaBnacaria;

//Classe criada para tratarmos de Pessoas F�sicas (CPF).
public class PessoaFisica {
	
	//Declara��o de vari�veis privadas ("privates") para pessoas f�sicas.
	private String idCPF;
	private String diaNascimento;
	private String mesNascimento;	
	private int    anoNascimento;
	private String generoPessoa;
	private int    idade;
	
	
	//CPF.
	public void setId (String cpf) {
		idCPF = cpf;
	}
	
	public String getID() {
		return idCPF;
	}
	
	//Data de nascimento da pessoa f�sica.
	
	//Dia.
	public void setDiaNascimento (String dia) {
		diaNascimento = dia;
	}
	
	public String getDiaNascimento () {
		return diaNascimento;
	}
	
	//M�s.
	public void setMesNascimento (String mes) {
		mesNascimento = mes;
	}
	
	public String getMesNascimento () {
		return mesNascimento;
	}
	
	//Ano.
	public void setAnoNascimento (int ano) {
		anoNascimento = ano;
	}
	
	public int getAnoNascimento () {
		return anoNascimento;
	}
	
	//G�nero da pessoa f�sica.
	public void setGenero (String genero) {
		generoPessoa = genero;
	}
	
	public String getGenero () {
		return generoPessoa;
	}
	
	//Idade da pessoa f�sica com base no ano de nascimento.
	public void setIdade (int ano) {
		idade = 2020 - ano;
	}
	
	public int getIdade () {
		return idade;
	}
}

