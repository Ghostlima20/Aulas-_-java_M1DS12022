
public enum DiaDaSemana {

	DOMINGO(1),SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6),SABADO(7); //cria�ao de objeto
	
	private int num; // cria�ao de atributo privado//atributos apenas visiveis para DiaDaSemana

	private DiaDaSemana(int num)  {//cria�ao de construtor
		this.num = num;
	}

	public int getNum() {// cria�ao de construtor para visualizar os atributos privados.
		return num;
	}
	
	
}
