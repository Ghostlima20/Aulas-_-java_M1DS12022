import java.util.Scanner;

public class LampadaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int criar = 0;
		int estado = 0;

		System.out.println("Ol� seja bem-vindo ao nosso sistema de cria��o de l�mpadas \n");
		System.out.println("Pressione 1 para criar uma l�mpada");
		criar = entrada.nextInt();
		if (criar != 1) {
			System.out.println("Obrigado por usar nosso sistema");

		} else {

			Lampada lampada = new Lampada(true);

			System.out.println("Quando a l�mpada � criada, ela j� vem acesa");
			System.out.println("Deseja mudar o estado da l�mpada? 1- Sim  2-N�o\n");
			estado = entrada.nextInt();
			if (estado != 1) {
				lampada.imprimir();
			} else {
				lampada.desligar();
				lampada.imprimir();
			}
		}
	}
}
