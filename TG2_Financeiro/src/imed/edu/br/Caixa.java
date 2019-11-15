package imed.edu.br;

public class Caixa {

	Integer Id_Doc;
	PlanoContas Id_Conta;
	Pessoas Id_Pessoa;
	Integer Tp_Doc;
	String Dt_Doc;
	Double Vlr_Doc;
	Integer Parcela;
	Integer Status_Doc;
	
	
	public Integer getId_Doc() {
		return Id_Doc;
	}
	public void setId_Doc(Integer id_Doc) {
		Id_Doc = id_Doc;
	}
	public PlanoContas getId_Conta() {
		return Id_Conta;
	}
	public void setId_Conta(PlanoContas id_Conta) {
		Id_Conta = id_Conta;
	}
	public Pessoas getId_Pessoa() {
		return Id_Pessoa;
	}
	public void setId_Pessoa(Pessoas id_Pessoa) {
		Id_Pessoa = id_Pessoa;
	}
	public Integer getTp_Doc() {
		return Tp_Doc;
	}
	public void setTp_Doc(Integer tp_Doc) {
		Tp_Doc = tp_Doc;
	}
	public String getDt_Doc() {
		return Dt_Doc;
	}
	public void setDt_Doc(String dt_Doc) {
		Dt_Doc = dt_Doc;
	}
	public Double getVlr_Doc() {
		return Vlr_Doc;
	}
	public void setVlr_Doc(Double vlr_Doc) {
		Vlr_Doc = vlr_Doc;
	}
	public Integer getParcela() {
		return Parcela;
	}
	public void setParcela(Integer parcela) {
		Parcela = parcela;
	}
	public Integer getStatus_Doc() {
		return Status_Doc;
	}
	public void setStatus_Doc(Integer status_Doc) {
		Status_Doc = status_Doc;
	}

	
}
