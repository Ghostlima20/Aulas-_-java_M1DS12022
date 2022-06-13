
public class Aplicacao {

	public static void main(String[] args) {
		// novo objeto veiculo
		// atributos criados na classe veiculo
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Chelovrete");
		veiculo.setModelo("Celta");
		veiculo.setAno(2012);
		veiculo.Imprimir();
		veiculo.Buzinar();
		System.out.println("-------------------");
		
		//  novo objeto carro
		Carro carro = new Carro();
		// carro tambem e um veiculo, nao houve necessidade de instanciar outro objeto do tipo veiculo 
		// contem os metodos e atributos
		carro.setMarca("vv");
		carro.setModelo("Gol");
		carro.setAno(2014);
		carro.setQuatroPortas(true);
		carro.Imprimir();
		carro.Buzinar();
		System.out.println("-------------------");
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("vv");
		caminhao.setModelo("back");
		caminhao.setAno(2009);
		caminhao.Imprimir();
		caminhao.Buzinar();
		System.out.println("-------------------");
		
		Moto moto = new Moto();
		moto.setMarca("kawaski");
		moto.setModelo("xj");
		moto.setAno(2020);
		moto.Imprimir();
		moto.empinar();
		System.out.println("-------------------");
		
		
	}

}
