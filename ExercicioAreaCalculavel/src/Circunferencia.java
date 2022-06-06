// A classe circunferencia implementa AreaCalculavel
public class Circunferencia implements AreaCalculavel{
	// Declarando variaveis
	double r;
	
	// O metodo calcularArea foi sobrescrito para passar os dados.
	@Override
	public double calcularArea() {
		return r*r*Math.PI;
	}

	// ira apresentar o resultado ao usuario.
	public void mostrarArea() {
		System.out.println("A área da Cinfureręncia é " + calcularArea() + " m2");
	}

}
