
public class Quadrado implements AreaCalculavel{

	private int lado;
	
	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}


	@Override
	public void calcularArea() {
		
		System.out.println("A area do quadrado � " + Math.pow(lado, 2));
		
	
		
	}

}
