// criaçao de uma lista
public enum DiaDaSemana {
	//  instanciado uma lista de dias da semana que recebe um  valor inteiro.
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);

	// variavel para os dias.
	private int num;
	
	// metodo getNum que retorna a variavel num
	public int getNum() {
		return num;
	}
	
	//  construtor privado 
	private DiaDaSemana(int num) {
		this.num = num;
	}
	
}
