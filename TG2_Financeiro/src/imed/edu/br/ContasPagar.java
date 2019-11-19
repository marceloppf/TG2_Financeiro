package imed.edu.br;

public class ContasPagar{
	
	         Caixa  doc;
	private String  dtVcto;
	private Integer numParcelaCP;
	private Double  vlrParcelaCP;	
	private String  dtPgto;
	private Double  vlrPgto;
	private Double  vlrJuroPgto;
	private Double  vlrDescPgto;
	private Integer stCP;
	
    public void CalcPag(String dtPgtoFor, Integer numParcFor, Double vlrParcFor ) {
    	this.numParcelaCP = numParcFor;
    	this.dtPgto = dtPgtoFor;
    	this.vlrJuroPgto = 0d;
    	this.vlrDescPgto = (vlrParcFor * 0.15);
    	this.vlrPgto = vlrParcFor - this.vlrDescPgto;
    	this.stCP = 1;
    }	
	
	public String getDtVcto() {
		return dtVcto;
	}
	public void setDtVcto(String dtVcto) {
		this.dtVcto = dtVcto;
	}
	public Integer getNumParcelaCP() {
		return numParcelaCP;
	}
	public void setNumParcelaCP(Integer numParcelaCP) {
		this.numParcelaCP = numParcelaCP;
	}
	public String getDtPgto() {
		return dtPgto;
	}
	public void setDtPgto(String dtPgto) {
		this.dtPgto = dtPgto;
	}
	public Double getVlrParcelaCP() {
		return vlrParcelaCP;
	}
	public void setVlrParcelaCP(Double vlrTotalCP, Double parcelas) {
		this.vlrParcelaCP = vlrTotalCP / parcelas;
	}
	public Double getVlrPgto() {
		return vlrPgto;
	}
	public void setVlrPgto(Double vlrPgto) {
		this.vlrPgto = vlrPgto;
	}
	
	public Double getVlrJuroPgto() {
		return vlrJuroPgto;
	}
	public void setVlrJuroPgto(Double vlrJuroPgto) {
		this.vlrJuroPgto = vlrJuroPgto;
	}

	public Double getVlrDescPgto() {
		return vlrDescPgto;
	}

	public void setVlrDescPgto(Double vlrDescPgto) {
		this.vlrDescPgto = vlrDescPgto;
	}

	public String getStCP() {
		if (this.stCP == 1) {
			return "PAGO";
		} else if(this.stCP == 2) {
			return "PENDENTE";
		} else { return "ATRASADO";}
	}
	public void setStCP(Integer stCP) {
		this.stCP = stCP;
	}
	public Caixa getDoc() {
		return doc;
	}
	public void setDoc(Caixa doc, Integer numParcela) {	
		this.doc = doc;
		this.setVlrParcelaCP(doc.getVlrDoc(), doc.getParcela());
		this.setNumParcelaCP(numParcela);		
		this.setDtPgto("00/00/0000");		
		this.setDtVcto(doc.getDtDoc());		
		this.setStCP(doc.getStDoc());		
	}
}