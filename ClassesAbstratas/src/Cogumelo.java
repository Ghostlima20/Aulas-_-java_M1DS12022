// A classe cogumelo ela e uma extençao de item, ou seja, possui os mesmos metodos que ela
public class Cogumelo extends Item{
	//Sobrescrevendo metodo pegar! da classe abstrata item
	@Override
	public void pegar() {
		System.out.println("Pegou Cogumelo");
	}
	
}
