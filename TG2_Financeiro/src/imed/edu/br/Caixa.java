package imed.edu.br;

public class Caixa {

	Integer idDoc;
	//Conta idConta;
	Pessoa idPessoa;
	Integer tipoDoc;
	String dataDoc;
	Double valorDoc;
	Integer parcela;
	Integer statusDoc;

	public Integer getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	public Conta getIdConta() {
		return idConta;
	}

	public void setIdConta(Conta idConta) {
		this.idConta = idConta;
	}

	public Pessoa getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Integer getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(Integer tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getDataDoc() {
		return dataDoc;
	}

	public void setDataDoc(String dataDoc) {
		this.dataDoc = dataDoc;
	}

	public Double getValorDoc() {
		return valorDoc;
	}

	public void setValorDoc(Double valorDoc) {
		this.valorDoc = valorDoc;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public Integer getStatusDoc() {
		return statusDoc;
	}

	public void setStatusDoc(Integer statusDoc) {
		this.statusDoc = statusDoc;
	}

}
