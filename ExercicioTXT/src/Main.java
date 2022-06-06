// Importando classes do Java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		String texto;
		
		System.out.println("Digite um texto aleatório");
		texto = entrada.nextLine()+"\n"; 
		System.out.println("Digite mais um texto aleatório");
		texto += entrada.nextLine(); 
		entrada.close();
		
		// O try tentara executar um codigo
		// quando terminar de exercutar nada sera perdido
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("texto.txt"))){
			// arquivo recebe o que o usuario digitar no arquivo.
			escrever.write(texto);
		}
		
		// BufferedReader ultilizado para ler um arquivo de texto
		try(BufferedReader ler = new BufferedReader(new FileReader("texto.txt"))){
			// Foram declaradas duas strings para auxiliar a ler linha do arquivo
			String line;
			String string="";
			
			while((line = ler.readLine()) != null) {// ira exercutada quando for verdadeira.
				 string = string + "\n" + line;
			}
			
			System.out.println(string);
		}
	}

}
