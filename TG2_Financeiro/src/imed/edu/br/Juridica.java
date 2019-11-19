package imed.edu.br;

public class Juridica extends Pessoa {
	private String CNPJ;
	private String Inscricao;
	private String dtFundacao;
	Pessoa idPessoa;
	
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
	public String getDtFundacao() {
		return dtFundacao;
	}
	public void setDtFundacao(String dtFundacao) {
		this.dtFundacao = dtFundacao;
	}	
}
