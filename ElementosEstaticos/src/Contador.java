
public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 10;
//	}
	
	//  foi definido que a variavel ora ser um valor definido que e 1
	static {
		valor = 1;	
	}

	//  foi definida uma variavel estatica ira ser sempre somar 1, ao valor
	public static void incrementar() {
		valor ++;
	}

	// getters que vai pegar o valor da variavel valor 
	public static int getValor() {
		return valor;
	}

}
