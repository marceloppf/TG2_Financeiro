package imed.edu.br;

public class Juridica extends Pessoa {

	private String cnpj;
	private String dtaFundacao;
	
	public Juridica() {
		setNome("PZ Salgados");
		setEndereco("Rua Coronel Chicuta 575");
		setCidade("Passo Fundo");
		setCep("99010010");
		setCnpj("13579086431");
		setDtaFundacao("15/11/2019");
		setTpPessoa(1);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDtaFundacao() {
		return dtaFundacao;
	}

	public void setDtaFundacao(String dtaFundacao) {
		this.dtaFundacao = dtaFundacao;
	}

}
