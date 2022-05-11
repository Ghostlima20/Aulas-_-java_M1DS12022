
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
	   // Fusca fusca = new Fusca();
		//rota.equals(ferrari);
		//rota.equals(fusca);
		
		//Automovel automovel = new Ferrari();
		//rota.equals(automovel);
		//automovel  = new Fusca();
		//rota.equals(automovel);

		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.Mostrapreco(apartamento);
		vendedor.Mostrapreco(ferrari);
}
}