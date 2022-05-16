
public class Main {

	public static void main(String[] args) {
		
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		System.out.println(x1);
		System.out.println(y1);		
		System.out.println(z1);
		System.out.println();
		
		double x[] = {3, 5, 3, 5};
		
		for (int aux = 0; aux < x.length; aux++) {
			System.out.println(" o valor do indice é " + aux +  " = " + x[aux]);
			
		}
		
		String nome[] = { "Webson", "Angela", "heloisy" };
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
			System.out.println(nome[aux1]);
			if (nome[aux1]=="Angela"){
				System.out.println(" O indice da Angela é = " + aux1 );	
				
			}
		}
		
		
	}

}
