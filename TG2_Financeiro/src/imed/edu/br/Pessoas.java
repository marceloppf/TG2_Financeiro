package imed.edu.br;

public class Pessoas {
	
	Integer Id_Pessoa;
	String  Nome;
	String  Endereco;
	String  Cidade;
	Integer CEP;
	Integer Tp_Pessoa;
		
	public Integer getId_Pessoa() {
		return Id_Pessoa;
	}
	public void setId_Pessoa(Integer id_Pessoa) {
		Id_Pessoa = id_Pessoa;
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
	public Integer getCEP() {
		return CEP;
	}
	public void setCEP(Integer cEP) {
		CEP = cEP;
	}
	public Integer getTp_Pessoa() {
		return Tp_Pessoa;
	}
	public void setTp_Pessoa(Integer tp_Pessoa) {
		Tp_Pessoa = tp_Pessoa;
	}
}
