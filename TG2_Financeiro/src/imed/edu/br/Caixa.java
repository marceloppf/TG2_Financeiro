//--------------------
//----- v. 0.0.1 -----
//--------------------
//Atualizado por : Marcelo
//Data : 13/11/2019 - 18:40

package imed.edu.br;

public class Caixa {
	Integer Id_Doc;
	String  Dt_Vcto; 
	Integer Num_Parcela;
	String  Dt_Receb;
	Double 	Vlr_Receb;
	Integer Status_CR;
	
	
	
	
	public Integer getId_Doc() {
		return Id_Doc;
	}
	public void setId_Doc(Integer id_Doc) {
		Id_Doc = id_Doc;
	}
	public String getDt_Vcto() {
		return Dt_Vcto;
	}
	public void setDt_Vcto(String dt_Vcto) {
		Dt_Vcto = dt_Vcto;
	}
	public Integer getNum_Parcela() {
		return Num_Parcela;
	}
	public void setNum_Parcela(Integer num_Parcela) {
		Num_Parcela = num_Parcela;
	}
	public String getDt_Receb() {
		return Dt_Receb;
	}
	public void setDt_Receb(String dt_Receb) {
		Dt_Receb = dt_Receb;
	}
	public Double getVlr_Receb() {
		return Vlr_Receb;
	}
	public void setVlr_Receb(Double vlr_Receb) {
		Vlr_Receb = vlr_Receb;
	}
	public Integer getStatus_CR() {
		return Status_CR;
	}
	public void setStatus_CR(Integer status_CR) {
		Status_CR = status_CR;
	}	

}
