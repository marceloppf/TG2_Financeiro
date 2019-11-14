package imed.edu.br;

public class Juridica {

	Pessoas Id_Pessoa;
	Integer CNPJ;
	Integer Inscricao;
	String Dt_Fundacao;
	
	public Pessoas getId_Pessoa() {
		return Id_Pessoa;
	}
	public void setId_Pessoa(Pessoas id_Pessoa) {
		Id_Pessoa = id_Pessoa;
	}
	public Integer getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Integer cNPJ) {
		CNPJ = cNPJ;
	}
	public Integer getInscricao() {
		return Inscricao;
	}
	public void setInscricao(Integer inscricao) {
		Inscricao = inscricao;
	}
	public String getDt_Fundacao() {
		return Dt_Fundacao;
	}
	public void setDt_Fundacao(String dt_Fundacao) {
		Dt_Fundacao = dt_Fundacao;
	}
}
