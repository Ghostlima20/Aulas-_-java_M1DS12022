
public class Main {
	//constantes.
	public static final double PI = 3.14;
	
	
	//criaçao de enum sem precisar de uma classe para especificar
	private enum Sexo{
		MASCULINO,FEMININO
	}

	public static void main(String[] args) {
		// Instanciando uma variavel
		double pi = Main.PI;
		
		// Instanciando objeto da classe DiaDaSemana.
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		// Instanciando variavel do tipo int.
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		// Um enum como String
		String s = "TERCA";
		// Aqui o objeto hoje,  convertido para String e irareceber o dia da semana
		hoje = DiaDaSemana.valueOf(s);
		System.out.println(hoje.getNum());
		
		// Aqui foi mostrado como e possivel chamar um Enum utilizando um objeto
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMININO;
		
		System.out.println(sexo);
	}

}
