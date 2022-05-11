
class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;

	@Override
	public void calcularArea() {
		System.out.println(" A area do retangulo é " + largura*altura );

	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}