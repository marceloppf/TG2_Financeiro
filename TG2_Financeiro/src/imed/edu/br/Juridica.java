package imed.edu.br;

public class Juridica extends Pessoa {

	private String cnpj;
	private String inscricao;
	private String dtaFundacao;
	
	public Juridica() {
		setTpPessoa(1);
	}

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
