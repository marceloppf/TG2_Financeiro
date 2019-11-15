package imed.edu.br;

public class SistemaFinanceiro {

	public static void main(String[] args) {
		
		PlanoContas pconta1 = new PlanoContas();
		PlanoContas pconta2 = new PlanoContas();		
		
		Fisica   pessF1 = new Fisica();
		Juridica pessJ1 = new Juridica();
				
		pconta1.setIdConta("1.1.001");
		pconta1.setNomeConta("Vendas para Clientes");
		pconta1.setTipoConta(1); //Contas a Receber
		
		pconta2.setIdConta("2.2.002");
		pconta2.setNomeConta("Pagamento a Fornecedores");
		pconta2.setTipoConta(2); //Contas a Receber		
		
		pessF1.setIdPessoa(01);
		pessF1.setTpPessoa(1); //Pessoa Física
		pessF1.setNome("José");
		pessF1.setCidade("Passo Fundo");
		pessF1.setCep("99999-999");
		pessF1.setCpf("999.999.999-99");
		pessF1.setRg("999.999.999-9");
		
		pessJ1.setIdPessoa(10);
		pessJ1.setTpPessoa(2); //Pessoa Jurídica
		pessJ1.setNome("Empresa do José");
		pessJ1.setCidade("Porto Alégre");
		pessJ1.setCep("99999-999");
		pessJ1.setCnpj("99.999.999.9999-99");
		pessJ1.setInscricao("9999999-9");

		System.out.println("Tipo Conta ("+pconta1.getTipoConta()+") : "+pconta1.getIdConta()+" - "+pconta1.getNomeConta());
		System.out.println("Tipo Conta "+pconta2.getTipoConta()+") : "+pconta2.getIdConta()+" - "+pconta2.getNomeConta());		
		
		System.out.println("Pessoa "+pessF1.getTpPessoa()+" : "+pessF1.getNome()+" - "+pessF1.getCidade()+" - CPF: "+pessF1.getCpf());
		System.out.println("Pessoa " + pessJ1.getTpPessoa() + " : " + pessJ1.getNome() + " - " + pessJ1.getCidade()
				+ " - CNPJ: " + pessJ1.getCnpj());

	}

}