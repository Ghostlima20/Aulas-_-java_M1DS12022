import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Matematica matematica = new Matematica();

			System.out.println("Somar dois numeros");
			System.out.println(" Digite o primeiro numero");
			int x = scanner.nextInt();
			
			System.out.println(" Digite o segundo numero ");
			int y = scanner.nextInt();

			
			int soma = matematica.somar(x, y);
			
			System.out.println(" O resultado é " + soma + " !!!!");
			
			soma=matematica.somar(x, y);
			System.out.println(" O resultado é " + soma + " !!!!");
			
			double soma2 = matematica.somar(x, y);
			System.out.println(" O resultado é " + soma2 + " !!! ");
		}
	}

}

