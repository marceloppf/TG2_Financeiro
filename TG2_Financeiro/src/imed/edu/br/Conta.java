package imed.edu.br;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String idConta;
	private List<ContasPagar> contasPagar = new ArrayList<>();
	private List<ContasReceber> contasReceber = new ArrayList<>();

	public Conta() {
		idConta = Double.toString(Math.random() * 1000);
	}
	
	public String getIdConta() {
		return idConta;
	}

	public List<ContasPagar> getContasPagar() {
		return contasPagar;
	}

	public void setContasPagar(List<ContasPagar> contasPagar) {
		this.contasPagar = contasPagar;
	}

	public List<ContasReceber> getContasReceber() {
		return contasReceber;
	}

	public void setContasReceber(List<ContasReceber> contasReceber) {
		this.contasReceber = contasReceber;
	}

	@Override
	public String toString() {
		return "Conta [idConta=" + idConta + ", contasPagar=" + contasPagar + ", contasReceber=" + contasReceber + "]";
	}

}
