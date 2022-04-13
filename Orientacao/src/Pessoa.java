
public class Pessoa {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}

	boolean dar(int numFigurinhas,  Pessoa pessoa) {
        
		boolean msg; 
		
		this.numFigurinhas -= numFigurinhas;

		pessoa.receber(numFigurinhas);
		
		if(this.numFigurinhas< numFigurinhas) {
			System.out.println(" O numero de figurinhas insulficiente");
			msg = false;
				
		} else {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			msg = true;
		}
	      return  msg;	
	}
	
}
