package ExercicioContaBnacaria;

public class Pessoa {
	
	//Declara��o de vari�veis privadas ("privates") para pessoas f�sicas ou jur�dicas.
	private String nomePessoa;
	private String enderecoPessoa;
	
	public void setNome (String nome) {
		nomePessoa = nome;
	}
	
	public String getNome () {
		return nomePessoa;
	}
	
	public void mostraNome () {
		System.out.println ("Cliente: "+nomePessoa);
	}
	public void setEndereco (String Endereco) {
		enderecoPessoa = Endereco;
	}
	
	public String getEndereco () {
		return enderecoPessoa;
	}
}
