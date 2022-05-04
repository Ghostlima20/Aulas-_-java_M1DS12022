
public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		
		veiculo.setMarca("hyndai");
		veiculo.setModelo("c3");
		veiculo.setAno(2014);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro Carro = new Carro();
		
		Carro.setMarca("FIAT");
		Carro.setModelo("STILO");
		Carro.setAno(2008);
		Carro.imprimir();
		Carro.setQuatroPortas(true);
		Carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMarca("mercedez benz");
		caminhao.setModelo("s10");
		caminhao.setAno(2021);
		caminhao.buzinar();
		caminhao.imprimir();
		
		Moto moto = new Moto();
		
		moto.setMarca("kawasaki");
		moto.setModelo("ninja");
		moto.setAno(2008);
		moto.chamanograu();
		moto.buzinar();
		moto.imprimir();
		
		
	
		
		
	}
}
