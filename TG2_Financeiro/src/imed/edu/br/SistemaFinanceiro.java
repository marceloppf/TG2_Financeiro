package imed.edu.br;

public class SistemaFinanceiro {

	public static void main(String[] args) {
		
		PlanoContas pconta1 = new PlanoContas();
		PlanoContas pconta2 = new PlanoContas();		
		
		// teste
		Fisica   pessF1 = new Fisica();
		Juridica pessJ1 = new Juridica();
				
		pconta1.setId_Conta("1.1.001");
		pconta1.setNome_Conta("Vendas para Clientes");
		pconta1.setTipo_Conta(1); //Contas a Receber
		
		pconta2.setId_Conta("2.2.002");
		pconta2.setNome_Conta("Pagamento a Fornecedores");
		pconta2.setTipo_Conta(2); //Contas a Receber		
		
		pessF1.setId_Pessoa(01);
		pessF1.setTp_Pessoa(1); //Pessoa Física
		pessF1.setNome("José");
		pessF1.setCidade("Passo Fundo");
		pessF1.setCEP("99999-999");
		pessF1.setCPF("999.999.999-99");
		pessF1.setCI("999.999.999-9");
		
		pessJ1.setId_Pessoa(10);
		pessJ1.setTp_Pessoa(2); //Pessoa Jurídica
		pessJ1.setNome("Empresa do José");
		pessJ1.setCidade("Porto Alégre");
		pessJ1.setCEP("99999-999");
		pessJ1.setCNPJ("99.999.999.9999-99");
		pessJ1.setInscricao("9999999-9");

		System.out.println("Tipo Conta ("+pconta1.getTipo_Conta()+") : "+pconta1.getId_Conta()+" - "+pconta1.getNome_Conta());
		System.out.println("Tipo Conta "+pconta2.getTipo_Conta()+") : "+pconta2.getId_Conta()+" - "+pconta2.getNome_Conta());		
		
		System.out.println("Pessoa "+pessF1.getTp_Pessoa()+" : "+pessF1.getNome()+" - "+pessF1.getCidade()+" - CPF: "+pessF1.getCPF());
		System.out.println("Pessoa " + pessJ1.getTp_Pessoa() + " : " + pessJ1.getNome() + " - " + pessJ1.getCidade()
				+ " - CNPJ: " + pessJ1.getCNPJ());

	}

}