package ExercicioContaBnacaria;

public class Pessoa {
	
	//Declaração de variáveis privadas ("privates") para pessoas físicas ou jurídicas.
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
