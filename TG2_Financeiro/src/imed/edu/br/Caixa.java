package imed.edu.br;

import java.util.*;

public class Caixa extends PlanoConta{

	Pessoa pessoa;	
	private Integer idDoc;	
	private Integer tpDoc; //1=CP 2=CR
	private String  dtDoc;
	private Double  vlrDoc;
	private Double  parcela;
	private Integer stDoc; //1=Pago 2=Pendente 3=Atrasado
	List<ContasReceber> totalContasReceber = new ArrayList<>();
	List<ContasPagar> totalContasPagar = new ArrayList<>();	
    
	public List<ContasReceber> getTotalContas() {
		return totalContasReceber;
	}
	public void setTotalContas(List<ContasReceber> totalContas) {
		this.totalContasReceber = totalContas;
	}

	public List<ContasPagar> getTotalContasPagar() {
		return totalContasPagar;
	}
	public void setTotalContasPagar(List<ContasPagar> totalContasPagar) {
		this.totalContasPagar = totalContasPagar;
	}
	
	public Integer getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}
	
	public Integer getTpDoc() {
		return tpDoc;
	}
	public void setTpDoc(Integer tpDoc) {
		this.tpDoc = tpDoc;
	}
	
	public String getDtDoc() {
		return dtDoc;
	}
	public void setDtDoc(String dtDoc) {
		this.dtDoc = dtDoc;
	}
	
	public Double getVlrDoc() {
		return vlrDoc;
	}
	public void setVlrDoc(Double vlrDoc) {
		this.vlrDoc = vlrDoc;
	}
	
	public Double getParcela() {
		return parcela;
	}
	public void setParcela(Double parcela) {
		this.parcela = parcela;
	}
	
	public Integer getStDoc() {
		return stDoc;
	}
	public void setStDoc(Integer stDoc) {
		this.stDoc = stDoc;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
