//--------------------
//----- v. 0.0.1 -----
//--------------------
//Atualizado por : Marcelo
//Data : 10/11/2019 - 15:30

package imed.edu.br;

public class ContasReceber {
	Caixa  Id_Doc;
	String Dt_Receb;
	Double Vlr_Receb;
	String Status_CR;
	
	
	public Caixa getId_Doc() {
		return Id_Doc;
	}
	public void setId_Doc(Caixa id_Doc) {
		Id_Doc = id_Doc;
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
	public String getStatus_CR() {
		return Status_CR;
	}
	public void setStatus_CR(String status_CR) {
		Status_CR = status_CR;
	}	
}
