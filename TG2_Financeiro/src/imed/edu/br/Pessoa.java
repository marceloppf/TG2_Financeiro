package imed.edu.br;

public class Pessoa {

	private Integer idPessoa;
	private String  Nome;
	private String  Endereco;
	private String  Cidade;
	private String  CEP;
	private Integer tpPessoa;
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTpPessoa() {
		if (this.tpPessoa == 1) {
			return "Física";
		} else { return "Jurídica";}
	}
	public void setTpPessoa(Integer tpPessoa) {
		this.tpPessoa = tpPessoa;
	}
}
