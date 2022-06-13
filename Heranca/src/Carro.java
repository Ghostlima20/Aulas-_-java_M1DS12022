
public class Carro extends Veiculo { //Extends coloca a classe como filha
	// Variavel 
	private boolean quatroPortas;
	
	// sobrescrever o metodo Imprimir
	@Override
	public void Imprimir() {
		// super herda 
		super.Imprimir();
		// mensagem para usuario
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	//getter e setter do boolean quatroPortas
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}
