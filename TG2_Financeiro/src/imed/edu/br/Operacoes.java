package imed.edu.br;

public class Operacoes {

	static public void compraAVista(Pessoa fisica, Pessoa juridica, double valor) {
		System.out.println("Pessoa " + fisica.getNome() + " realizando compra a vista de R$ " + valor);
		ContasPagar cp = new ContasPagar(valor);
		fisica.getConta().getContasPagar().add(cp);
		juridica.getConta().getContasReceber().add(new ContasReceber(cp));
	}

//	static public void compraParcelado(Pessoa fisica, Pessoa juridica, double valor) {
//		System.out.println("Pessoa " + fisica.getNome() + " realizando compra parcelada de R$ " + valor + " em 10x - juros de 10%");
//		
//		for(int i = 0; i < 10; i++) {
//			ContasPagar cp = new ContasPagar((valor + (valor * 0.10))/10);
//			fisica.getConta().getContasPagar().add(cp);
//			juridica.getConta().getContasReceber().add(new ContasReceber(cp));
//		}
//	}
	
	public void pagamento(Pessoa fisica, Pessoa juridica) {
		ContasPagar cp = fisica.getConta().getContasPagar().get(0);
		
	}
	
}
