package imed.edu.br;

public class Fisica extends Pessoa {

	private String cpf;
	private String rg;
	private String dtNasc;
	
	public Fisica() {
		setNome("Pedro Saraiva");
		setEndereco("Avenida Brasil 666");
		setCidade("Passo Fundo");
		setCep("99010000");
		setDtNasc("07/07/1990");
		setRg("98765432112");
		setCpf("12345678");
		setTpPessoa(0);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

}
