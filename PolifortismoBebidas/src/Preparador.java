
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a Bebida " + bebida.getNome());
		
		bebida.preparar();
				
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a Bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida Preparada com Sucesso!!\n ");
	}

}
