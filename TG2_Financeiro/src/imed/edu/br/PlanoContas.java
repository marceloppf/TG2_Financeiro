package imed.edu.br;

public class PlanoContas {
	private String  Id_Conta;
	private String  Nome_Conta;
	private Integer Tipo_Conta;
	
	public String getId_Conta() {
		return Id_Conta;
	}
	public void setId_Conta(String id_Conta) {
		Id_Conta = id_Conta;
	}
	public String getNome_Conta() {
		return Nome_Conta;
	}
	public void setNome_Conta(String nome_Conta) {
		Nome_Conta = nome_Conta;
	}
	public String getTipo_Conta() {
		if (this.Tipo_Conta == 1) {
			return "CP";
		}else {return "CR";}
	}
	public void setTipo_Conta(Integer tipo_Conta) {
		Tipo_Conta = tipo_Conta;
	}
}
