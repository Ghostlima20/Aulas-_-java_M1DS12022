
public abstract class Item {

	private int posX; // CRIANDO UMA VARIAVEL PRIVADA TIPO INTEIRO
	private int posY; // CRIANDO UMA VARIAVEL PRIVADA TIPO INTEIRO
	
	public abstract void pegar(); //

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
