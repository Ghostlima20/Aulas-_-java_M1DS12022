// A classe diamante e uma extençao de Item, que e uma classe generica 
public class Diamante extends Item{

	// o metodo foi ultilizado para pegar da classe item, e ele foi sobrescrevido para que possa se adequar as necessidadese especificas dessa classe
	@Override
	public void pegar() {
		System.out.println("Pegou Diamante"); // mesnagem mostrada ao usuario.
	}
}
