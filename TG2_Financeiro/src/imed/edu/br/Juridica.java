package imed.edu.br;

public class Juridica extends Pessoa {

	private String CNPJ;
	private String IE;
	private String dtFundacao;
	Pessoa idPessoa;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getInscricao() {
		return IE;
	}

	public void setInscricao(String ie) {
		IE = ie;
	}

	public String getDtFundacao() {
		return dtFundacao;
	}

	public void setDtFundacao(String dtFundacao) {
		this.dtFundacao = dtFundacao;
	}
}
