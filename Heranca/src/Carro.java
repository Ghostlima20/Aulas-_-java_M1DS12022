
public class Carro extends Veiculo {
	
	private boolean quatroPortas;
	
	

	@Override
	public void imprimir() {
		
		System.out.println(" tem Quatro portas ? " + quatroPortas);
		
		super.imprimir();
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	

}
