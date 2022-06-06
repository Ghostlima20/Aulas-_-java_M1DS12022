// Importando classe Scanner
import java.util.Scanner;

public class Calculo {
	// Projeto realizado por conta.
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		// Criando variaveis
		int numero1 =0;
		int numero2 =0;
		int soma=0;
		int subtracao=0;
		int operacao=0;
		int multiplicacao=0;
		int divisao=0;
		int continua=1;
		
		// loop utilizado para permitir que a pessoa faca quantas contas ela desejar ate quando ela desejar sair
		while(continua==1) {
		System.out.print("Selecione a operação desejada: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão \n");
		operacao=entrada.nextInt();
		
		// usuario so pode digitar numeros validos 0 a 4
		if(operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
			System.out.printf("Não é possível realizar essa operação \n");
		}
		else {
		
		// intergaindo com o usuario
		System.out.print("Digite o primeiro número: \n");
		numero1= entrada.nextInt();
		System.out.print("Digite o segundo número: \n");
		numero2= entrada.nextInt();
		
		// Contas que o usuario escolheu.
		if(operacao == 1) {
		soma=numero1+numero2;
		System.out.printf("A soma é: %d\n", soma);
		}
		
		if(operacao == 2) {
			subtracao=numero1-numero2;
			System.out.printf("A subtração é: %d\n", subtracao);
			}
		
		if(operacao == 3) {
			multiplicacao=numero1*numero2;
			System.out.printf("A multiplicação é: %d\n", multiplicacao);
			}
		
		if(operacao == 4) {
			divisao=numero1/numero2;
			System.out.printf("A divisão é: %d\n", divisao);
			}
		
		// Validacao  se o usuario desejar mais contas.
		System.out.println("\n Deseja realizar mais algum cálculo? 1-Sim 2-Não");
		continua=entrada.nextInt();
		
		if(continua != 1){
			System.out.println("Obrigado pela preferência!");
		}
		}
	}
	}
}
