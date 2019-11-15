package imed.edu.br;

public class Pessoas {
	
	private Integer Id_Pessoa;
	private String  Nome;
	private String  Endereco;
	private String  Cidade;
	private String CEP;
	private Integer Tp_Pessoa;
	
	
		
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
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTp_Pessoa() {
		if (this.Tp_Pessoa == 1) {
			return "Física";
		}else{ return "Juridica";}
	}
	public void setTp_Pessoa(Integer tp_Pessoa) {
		Tp_Pessoa = tp_Pessoa;
	}
}
