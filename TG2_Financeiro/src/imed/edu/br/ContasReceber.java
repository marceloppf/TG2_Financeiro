package imed.edu.br;

public class ContasReceber {
	ContasPagar contaPagar;
	String dataReceb;
	Double valorPagamento;
	String statusCr;

	public ContasReceber(ContasPagar contaPagar) {
		this.contaPagar = contaPagar;
		this.valorPagamento = contaPagar.getValorConta();
		setStatusCr("Pago");
	}

	public String getDataReceb() {
		return dataReceb;
	}

	public void setDataReceb(String dataReceb) {
		this.dataReceb = dataReceb;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorReceb) {
		this.valorPagamento = valorReceb;
	}

	public String getStatusCr() {
		return statusCr;
	}

	public void setStatusCr(String statusCr) {
		this.statusCr = statusCr;
	}

	@Override
	public String toString() {
		return "ContasReceber [dataReceb=" + dataReceb + ", valorReceb=" + valorPagamento + ", statusCr=" + statusCr + "]";
	}

}
