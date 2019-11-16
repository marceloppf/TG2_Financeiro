package imed.edu.br;

import java.time.Instant;

public class ContasPagar {
	String id;
	String dataPagamento;
	Double valorConta;
	String statusCp;

	public ContasPagar(Double valor) {
		id = Instant.now().toString();
		setStatusCp("A Pagar");
		setValorConta(valor);
		setDataPagamento("10/10/2010");
	}
	
	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorConta() {
		return valorConta;
	}

	public void setValorConta(Double valorPagamento) {
		this.valorConta = valorPagamento;
	}

	public String getStatusCp() {
		return statusCp;
	}

	public void setStatusCp(String statusCp) {
		this.statusCp = statusCp;
	}

	@Override
	public String toString() {
		return "ContasPagar [dataPagamento=" + dataPagamento + ", valorPagamento=" + valorConta + ", statusCp="
				+ statusCp + "]";
	}
	
}
