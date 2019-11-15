package imed.edu.br;

public class ContasPagar {
	Caixa  Id_Doc;
	String Dt_PG;
	Double Vlr_PG;
	String Status_CP;
	
	public Caixa getId_Doc() {
		return Id_Doc;
	}
	public void setId_Doc(Caixa id_Doc) {
		Id_Doc = id_Doc;
	}
	public String getDt_PG() {
		return Dt_PG;
	}
	public void setDt_PG(String dt_PG) {
		Dt_PG = dt_PG;
	}
	public Double getVlr_PG() {
		return Vlr_PG;
	}
	public void setVlr_PG(Double vlr_PG) {
		Vlr_PG = vlr_PG;
	}
	public String getStatus_CP() {
		return Status_CP;
	}
	public void setStatus_CP(String status_CP) {
		Status_CP = status_CP;
	}
	
	
}
