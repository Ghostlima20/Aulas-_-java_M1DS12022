package modificadorAcesso;

public class contabancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	public contabancaria() {
		ativo = true;
		saldo = 1000;
		}

	
	public contabancaria(boolean ativo, double saldo) {
		super();
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public void receber(double valor) {
		saldo += valor;
		
	}
	
	public double saldo() {

		return saldo;
	}

	
	public void dar (double valor) {
		if(saldo >= valor)
		saldo -= valor; 
	}
	
}
