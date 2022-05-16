import java.util.Scanner;

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
		
		int[] arrayInt = new int[5]; //criaçao de conteudo linhas vazias
		String[]arraStrings = new String[4];
		double[] ArrayDouble = new double [3];
		
		arrayInt[3] = 4;
		
		int[] numero = new int[6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println(" Digite um numero qualquer ");
			numero[aux2] = teclado.nextInt();
				
			}
		
		for (int aux2=0; aux2 < numero.length; aux2++){
		System.out.println(" Indice " + aux2 +  " = " + numero[aux2]);
		
		}	
		
	}

}
