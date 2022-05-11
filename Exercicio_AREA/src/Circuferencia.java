
public class Circuferencia implements AreaCalculavel {

	private int r;
	
	public void  calcularArea() {
		
		System.out.println("A circuferencia do circulo é " + Math.PI*Math.pow(r, 2));
		

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
