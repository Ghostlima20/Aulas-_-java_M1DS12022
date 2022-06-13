//Aqui foi importada a classe Scanner
import java.util.Scanner; 

public class Aplicacao {

	public static void main(String[] args) {
		// A classe Scanner ira interagir com o usuario
		Scanner valor = new Scanner(System.in);
		// Aqui foi instanciada a variavel matematica 
		Matematica matematica = new Matematica();
		
		
		System.out.println("Área dos polígonos");
		System.out.println("Digite a altura do polígono");
		// O comando nextInt() e do metodo Scanner e permite que o usuario digite um valor e ele interprete como int
		int x = valor.nextInt();
		System.out.println("Digite a largura do polígono");
		int y = valor.nextInt();
		
		// metodos da classe Matematica
		int areaQ = matematica.area(x,y);
		
		double areaT = matematica.area(x,y);
		
		int areaR = matematica.area(x,y);
		
		// Resultado final sendo exibido para o usuario
		System.out.println("");
		System.out.println("A área do quadrado é: " + areaQ);
		System.out.println("A área do triângulo é: " + areaT);
		System.out.println("A área do retângulo é: " + areaR);
	}

}
