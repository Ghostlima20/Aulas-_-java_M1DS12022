
public class Retangulo implements AreaCalculavel{
	// Declarando variaveis
	double x;
	double y;
	
	
	@Override
	public double calcularArea() {
		return x*y;
	}

	
	public void mostrarArea() {
		System.out.println("A área do Retângulo é " + calcularArea() + " m2");
	}

}
