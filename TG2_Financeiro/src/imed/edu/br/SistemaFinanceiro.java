package imed.edu.br;

public class SistemaFinanceiro {

	public static void main(String[] args) {
		
		Fisica pessF = new Fisica();
		Juridica pessJ = new Juridica();
		
		Caixa cx1 = new Caixa();
		Caixa cx2 = new Caixa();		
		
		ContasPagar cp1 = new ContasPagar();
		ContasPagar cp2 = new ContasPagar();		

		ContasReceber cr1 = new ContasReceber();
		ContasReceber cr2 = new ContasReceber();
		ContasReceber cr3 = new ContasReceber();
		ContasReceber cr4 = new ContasReceber();
		ContasReceber cr5 = new ContasReceber();
		
		//PESSOA---------------------------------------
		pessF.setIdPessoa(01);
		pessF.setTpPessoa(1); //Tipo da pessoa = Física
		pessF.setNome("José");
		pessF.setCidade("Passo Fundo");
		pessF.setCEP("99999-999");
		pessF.setCPF("999.999.999-99");
		pessF.setRG("999.999.999-9");

		pessJ.setIdPessoa(10);
		pessJ.setTpPessoa(2); //Tipo da pessoa = Jurídica
		pessJ.setNome("Distribuidora");
		pessJ.setCidade("Porto Alégre");
		pessJ.setCEP("99999-999");
		pessJ.setCNPJ("99.999.999.9999-99");
		pessJ.setInscricao("9999999-9");
		
		//CAIXA(DOC)-------------------------------------		
		cx1.setIdConta("1.1.01");
		cx1.setDescContas("Venda Cliente");
		cx1.setTpConta(1); //Tipo da conta 1 = Receber
		cx1.setIdDoc(185);
		cx1.setTpDoc(1); //Tipo do doc 1 = Receber
		cx1.setDtDoc("12/10/2019");
		cx1.setVlrDoc(1000d);
		cx1.setParcela(5d);
		cx1.setStDoc(2); //1=Pago 2-Pendente 3=Atrasado
		cx1.setPessoa(pessF);
		
		cr1.setDoc(cx1, 1);
		cr2.setDoc(cx1, 2);
		cr3.setDoc(cx1, 3);
		cr4.setDoc(cx1, 4);
		cr5.setDoc(cx1, 5);
		
		cx1.totalContasReceber.add(cr1);
		cx1.totalContasReceber.add(cr2);
		cx1.totalContasReceber.add(cr3);
		cx1.totalContasReceber.add(cr4);
		cx1.totalContasReceber.add(cr5);		
		
		cx2.setIdConta("2.2.02");
		cx2.setDescContas("Pagamento Fornec");
		cx2.setTpConta(2); //Tipo da conta 2 = Pagar	
		cx2.setIdDoc(255);
		cx2.setTpDoc(2); //Tipo do doc 1 = Receber
		cx2.setDtDoc("31/10/2019");
		cx2.setVlrDoc(500d);
		cx2.setParcela(2d);
		cx2.setStDoc(2);//1=Pago 2-Pendente 3=Atrasado			
		cx2.setPessoa(pessJ);		
		
		cp1.setDoc(cx2, 1);
		cp2.setDoc(cx2, 2);
		
		cx2.totalContasPagar.add(cp1);
		cx2.totalContasPagar.add(cp2);
		
		System.out.println("---->>>> CONTAS A RECEBER");
		for (ContasReceber contasReceber : cx1.totalContasReceber) {
			System.out.println("("+contasReceber.getDoc().getDescConta()+" - "+contasReceber.getDoc().getIdConta() + "): " + 
					           "Cli: "+contasReceber.getDoc().getPessoa().getIdPessoa()+"/"+contasReceber.getDoc().getPessoa().getNome()+ " - " +
					           "Doc/Vlr: "+contasReceber.getDoc().getIdDoc()+"/"+contasReceber.getDoc().getVlrDoc()+ " - " +
					           "Par.Nº: "+contasReceber.getNumParcelaCR() + " - " +					
					           "Vlr.Parc: "+contasReceber.getVlrParcelaCR() + " - " +
					           "Dt.Vcto: "+contasReceber.getDtVcto() + " - " +
					           "Dt.Receb: "+contasReceber.getDtReceb() + " - " +
					           "Status: "+contasReceber.getStCR());
		}
		
		System.out.println("");
		
		System.out.println("---->>>> CONTAS A PAGAR");
		for (ContasPagar contasPagar : cx2.totalContasPagar) {
			System.out.println("("+contasPagar.getDoc().getDescConta()+" - "+contasPagar.getDoc().getIdConta() + "): " + 
					           "Forn: "+contasPagar.getDoc().getPessoa().getIdPessoa()+"/"+contasPagar.getDoc().getPessoa().getNome()+ " - " +
					           "Doc/Vlr: "+contasPagar.getDoc().getIdDoc()+"/"+contasPagar.getDoc().getVlrDoc()+ " - " +
					           "Parc.Nº: "+contasPagar.getNumParcelaCP() + " - " +					
					           "Vlr.Parc: "+contasPagar.getVlrParcelaCP() + " - " +
					           "Dt.Vcto: "+contasPagar.getDtVcto() + " - " +
					           "Dt.Pgto: "+contasPagar.getDtPgto() + " - " +
					           "Status: "+contasPagar.getStCP());
		}
		
		cr1.CalcReceb("10/11/2019", 1, 200d);		
		cp1.CalcPag("25/09/2019", 1, 250d);		
		
		System.out.println("");
		System.out.println("---->>>> Operação Receber");
		System.out.println("("+cr1.getDoc().getDescConta()+" - "+cr1.getDoc().getIdConta()+ "): " +
				           "Cli: "+cr1.getDoc().getPessoa().getIdPessoa()+ " - " +
				           "Doc: "+cr1.getDoc().getIdDoc()+ " - " +
				           "Par.Nº: "+cr1.getNumParcelaCR()+ " - " +
				           "Vlr.Parc: "+cr1.getVlrParcelaCR()+ " - " +
				           "Dt.Vcto: "+cr1.getDtVcto()+ " - " +				
				           "Dt.Receb: "+cr1.getDtReceb()+ " - " +
				           "Vlr.Receb: "+cr1.getVlrReceb()+ " - " +
				           "Vlr.Juro: "+cr1.getVlrJuroReceb()+ " - " +				           
		                   "Status: "+cr1.getStCR());	
		
		System.out.println("");
		System.out.println("---->>>> Operação Pagar");
		System.out.println("("+cp1.getDoc().getDescConta()+" - "+cp1.getDoc().getIdConta()+ "): " +
				           "Cli: "+cp1.getDoc().getPessoa().getIdPessoa()+ " - " +
				           "Doc: "+cp1.getDoc().getIdDoc()+ " - " +
				           "Par.Nº: "+cp1.getNumParcelaCP()+ " - " +
				           "Vlr.Parc: "+cp1.getVlrParcelaCP()+ " - " +
				           "Dt.Vcto: "+cp1.getDtVcto()+ " - " +				
				           "Dt.Pgto: "+cp1.getDtPgto()+ " - " +
				           "Vlr.Pgto: "+cp1.getVlrPgto()+ " - " +		           
				           "Vlr.Desc: "+cp1.getVlrDescPgto()+ " - " +
		                   "Status: "+cp1.getStCP());		
	}

}
