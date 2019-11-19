package imed.edu.br;

public class PlanoConta {
	private String  idConta;
	private String  descContas;
	private Integer tpConta;
	
	public String getIdConta() {
		return idConta;
	}
	public void setIdConta(String idConta) {
		this.idConta = idConta;
	}
	public String getTpConta() {
		if(this.tpConta == 1) {
			return "CP";
		} else { return "CR";}
	}
	public void setTpConta(Integer tpConta) {
		this.tpConta = tpConta;
	}
	public String getDescContas() {
		return descContas;
	}
	public void setDescContas(String descContas) {
		this.descContas = descContas;
	}
}
