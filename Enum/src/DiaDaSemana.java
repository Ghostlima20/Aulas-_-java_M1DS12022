
public enum DiaDaSemana {

	DOMINGO(1),SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6),SABADO(7); //criaçao de objeto
	
	private int num; // criaçao de atributo privado//atributos apenas visiveis para DiaDaSemana

	private DiaDaSemana(int num)  {//criaçao de construtor
		this.num = num;
	}

	public int getNum() {// criaçao de construtor para visualizar os atributos privados.
		return num;
	}
	
	
}
