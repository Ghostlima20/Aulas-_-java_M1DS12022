
public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(6);
		quadrado.calcularArea();
		
		Circuferencia circuferencia = new Circuferencia();
		circuferencia.setR(6);
		circuferencia.calcularArea();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(5);
		retangulo.setLargura(5);
		retangulo.calcularArea();
		

	}

}
