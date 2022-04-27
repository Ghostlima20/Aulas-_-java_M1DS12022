package modificadorAcesso;

public class main {

	public static void main(String[] args) {
	
		contabancaria conta1 = new contabancaria(true,3000);
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		
		//conta1.receber(150.8);
		//conta1.dar(50.8);
		System.out.println((conta1.saldo()));
	
		contabancaria conta2 = new contabancaria();
		System.out.println((conta2.saldo()));
		
	}

}
