
public class Main {

	public static void main(String[] args) {
		
		//criaçao de variavel tipo inteiro
		// nao precisou da  necessidade de instanciar um objeto para chama-lo.
		int resultado = Matematica.somar(2, 3);
		
		System.out.println(resultado);
		
		// A mesma variavel chamou o metodo subtrair da classe matematica
		resultado = Matematica.subtrair(10, 4);
		
		System.out.println(resultado);
		
		// possivel chamar os metodos usando objeto
		// esta instanciado 3 objetos 
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		// O objeto contador1 chamou o metodo incrementar da classe 
		contador1.incrementar();
		
		//  chamado 3 vezes o metodo getValor por meio dos objetos criados
		System.out.println(contador1.getValor());
		System.out.println(contador2.getValor());
		System.out.println(contador3.getValor());
		
		// metodo incrementar foi chamado direto pela classe sem a necessidade e instanciar um objeto, pois e um metodo estatico 
		Contador.incrementar();
		// o mesmo objetivo pro getValor
		System.out.println(Contador.getValor());
		
		// mostrar contatante Media da prova
		System.out.println(Constantes.MEDIA_DA_PROVA);
	}

}
