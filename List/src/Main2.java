import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("WEB");
		lista.add(10);
		lista.add(true);
		
		
//	for(int x=0; x< lista.size(); x++) {
//	
//		System.out.println(lista.get(x));
//		
//		System.out.println();
//	
//		}
//		
//		lista.remove(0);
//		for(int x=0; x< lista.size(); x++) {
//			
//			System.out.println(lista.get(x));
//		}		
//		
//		
//		lista.set(0, "ghi");	
//		
//		for(Object valor : lista) {
//			
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		
////		lista.clear();
//		if(lista.isEmpty()) {
//			System.out.println("sua lista esta vazia");
//		}
		
		
		 Conta conta1 = new Conta ("Agua",60.00);
		 Conta conta2 = new Conta ("Luz", 120.00);
		 
		 List<Conta> listaDeContas = new ArrayList<Conta>();
		 
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
		
	}
	
	
	

	 
	 

	}

