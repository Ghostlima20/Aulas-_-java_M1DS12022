
public class Aplicacao {

	public static void main(String[] args) {
	
		Data d1 = new Data(4, 05, 2022, 9, 06, 10);
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);

		Data d2 = new Data(4, 05, 2022, 21, 05, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
	
		Data d3 = new Data(4, 5, 2022);
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}
}
