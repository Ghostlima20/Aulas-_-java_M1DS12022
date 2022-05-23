import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setEndereco(new Endereco());
		
		pessoa.getEndereco().setRua(null);
		pessoa.setNome(null);
		
		System.out.println("Por favor escreva seu nome");
		pessoa.setNome(entrada.nextLine());
		
		System.out.println(" Por favor digite a sua idade");
		

	}

}
