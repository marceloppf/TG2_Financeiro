package imed.edu.br;

public class SistemaFinanceiro {

	public static void main(String[] args) {
		
		Pessoa fisica = new Fisica();
		Pessoa juridica = new Juridica();
		
		Operacoes.compraAVista(fisica, juridica, 100.00);
		//Operacoes.compraParcelado(fisica, juridica, 100.00);
		
		System.out.println("Pessoa Fisica" + fisica.getConta().getContasPagar());
		System.out.println("Pessoa Juridica" + juridica.getConta().getContasReceber());
	}

}