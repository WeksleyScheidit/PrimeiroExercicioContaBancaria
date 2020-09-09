package ExercicioContaBnacaria;

//Classe criada para tratarmos de Pessoas Jurídicas (CNPJ).
public class PessoaJuridica {

	//Declaração de variáveis privadas ("privates") para pessoas jurídicas.
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
