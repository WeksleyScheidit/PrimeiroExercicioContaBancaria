package ExercicioContaBnacaria;

//Classe criada para tratarmos de Pessoas Jur�dicas (CNPJ).
public class PessoaJuridica {

	//Declara��o de vari�veis privadas ("privates") para pessoas jur�dicas.
	private String idCNPJ;
	private String ramoAtuacao;

	//CNPJ.
	public void setCnpj (String cnpj) {
		idCNPJ = cnpj;
	}
	
	public String getCnpj () {
		return idCNPJ;
	}
	
	//Atividade.
	public void setAtividade (String atividade) {
		ramoAtuacao = atividade;
	}
	
	public String getAtividade () {
		return ramoAtuacao;
	}	
	
}
