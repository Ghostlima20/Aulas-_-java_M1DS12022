
public class Main {
	
	public static final double PI  = 3.14;//criaçao de uma constante tipo primitivo publica

	
	private enum Sexo{
		MASCULINO,FEMININO;
	}
	
	public static void main(String[] args) {
		
		
	double pi = Main.PI;
	
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //criando variavel dia da semana
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		
		System.out.println(num); // ira apresentar o que dentro de num.
		
		String s= "TERCA"; // criaçao de uma string para terça.
		
		hoje = DiaDaSemana.valueOf(s); //criaçao de metodo para conversao.
		
		
		System.out.println(hoje.getNum()); //apresenta o valor de hoje (3).
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
	
		

	}

}
