package imed.edu.br;

public class ContasReceber {
    		 Caixa  doc; 
    private String  dtVcto;
    private Integer numParcelaCR;
    private Double  vlrParcelaCR;    
    private String  dtReceb;
    private Double  vlrReceb;
    private Double  vlrJuroReceb;
    private Double  vlrDescReceb;
    private Integer stCR;
    
    public void CalcReceb(String dtRecebCli, Integer numParcCli, Double vlrParcCli ) {
    	this.numParcelaCR = numParcCli;
    	this.dtReceb = dtRecebCli;
    	this.vlrJuroReceb = (vlrParcCli * 0.30);
    	this.vlrDescReceb = 0d;
    	this.vlrReceb = vlrParcCli + this.vlrJuroReceb;
    	this.stCR = 1;
    }
    
	public String getDtVcto() {
		return dtVcto;
	}
	public void setDtVcto(String dtVcto) {
		this.dtVcto = dtVcto;
	}
	public Integer getNumParcelaCR() {
		return numParcelaCR;
	}
	public void setNumParcelaCR(Integer numParcelaCR) {
		this.numParcelaCR = numParcelaCR;
	}
	public String getDtReceb() {
		return dtReceb;
	}
	public void setDtReceb(String dtReceb) {
		this.dtReceb = dtReceb;
	}
	public Double getVlrParcelaCR() {
		return vlrParcelaCR;
	}
	public void setVlrParcelaCR(Double vlrTotalCR, Double parcelas) {
		this.vlrParcelaCR = vlrTotalCR / parcelas;
	}
	public Double getVlrReceb() {
		return vlrReceb;
	}
	public void setVlrReceb(Double vlrReceb) {
		this.vlrReceb = vlrReceb;
	}
	public String getStCR() {	
		if (this.stCR == 1) {
			return "PAGO";
		} else if(this.stCR == 2) {
			return "PENDENTE";
		} else { return "ATRASADO";}		
	}
	public void setStCR(Integer stCR) {
		this.stCR = stCR;
	}	
	public Double getVlrJuroReceb() {
		return vlrJuroReceb;
	}

	public void setVlrJuroReceb(Double vlrJuroReceb) {
		this.vlrJuroReceb = vlrJuroReceb;
	}

	public Double getVlrDescReceb() {
		return vlrDescReceb;
	}

	public void setVlrDescReceb(Double vlrDescReceb) {
		this.vlrDescReceb = vlrDescReceb;
	}

	public Caixa getDoc() {
		return doc;
	}
	public void setDoc(Caixa doc, Integer numParcela) {
		this.doc = doc;
		this.setVlrParcelaCR(doc.getVlrDoc(), doc.getParcela());
		this.setNumParcelaCR(numParcela);		
		this.setDtReceb("00/00/0000");		
		this.setDtVcto(doc.getDtDoc());		
		this.setStCR(doc.getStDoc());
	}
	
	public void criarParcelas() {
		
	}
	
}