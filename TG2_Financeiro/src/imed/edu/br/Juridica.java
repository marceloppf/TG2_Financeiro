package imed.edu.br;

public class Juridica extends Pessoas {

	Pessoas Id_Pessoa;
	private String CNPJ;
	private String Inscricao;
	private String Dt_Fundacao;
	
		
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getInscricao() {
		return Inscricao;
	}
	public void setInscricao(String inscricao) {
		Inscricao = inscricao;
	}
	public String getDt_Fundacao() {
		return Dt_Fundacao;
	}
	public void setDt_Fundacao(String dt_Fundacao) {
		Dt_Fundacao = dt_Fundacao;
	}	
	
}
