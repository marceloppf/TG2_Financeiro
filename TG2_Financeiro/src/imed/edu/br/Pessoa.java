package imed.edu.br;

public class Pessoa {

	private String nome;
	private String endereco;
	private String cidade;
	private String cep;
	private Integer tpPessoa;
	private Conta conta;
	
	public Pessoa() {
		setConta(new Conta());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getTpPessoa() {
		return tpPessoa;
	}

	public void setTpPessoa(Integer tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}