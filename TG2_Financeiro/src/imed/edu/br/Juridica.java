package imed.edu.br;

public class Juridica extends Pessoas {

	private String cnpj;
	private String inscricao;
	private String dtaFundacao;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getDtaFundacao() {
		return dtaFundacao;
	}

	public void setDtaFundacao(String dtaFundacao) {
		this.dtaFundacao = dtaFundacao;
	}

}
