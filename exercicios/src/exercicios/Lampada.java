package exercicios;

public class Lampada {
	
	private boolean estado = false;
	
	public void okLigada() {
		estado=true;
	}
public void off() {
	estado=false;
}
public void imprimir() {
	if (estado==false) {
		System.out.println("lampada desligada");
	}
	else {
		System.out.println("lampada ligada");
		}
}
}
