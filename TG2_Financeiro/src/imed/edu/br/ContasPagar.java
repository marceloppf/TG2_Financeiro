package imed.edu.br;

public class ContasPagar {
	Caixa idDoc;
	String dataPagamento;
	Double valorPagamento;
	String statusCp;

	public Caixa getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Caixa idDoc) {
		this.idDoc = idDoc;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public String getStatusCp() {
		return statusCp;
	}

	public void setStatusCp(String statusCp) {
		this.statusCp = statusCp;
	}

}
