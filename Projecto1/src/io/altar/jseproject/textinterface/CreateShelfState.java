package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;


public class CreateShelfState implements State{
	
	@Override
	public boolean runState() {	
		
		System.out.println("###### NOVA PRATELEIRA: ######");
		Shelf shelf;

		
		// Introduzir Preço da Prateleira
		double price = 0.0;
		do {
			System.out.println("");
			System.out.println("Introduza o preço diário do aluguer da prateleira a criar.");
		    String sPrice = Reader.read();
			
			price = Reader.toDouble(sPrice, 0.0);
				if (price == 0.0){
					System.out.println("XX " + sPrice + " - nao e um valor de preço valido. XX");
					System.out.println("");
				}
				
		}while (price == 0.0);
		
		// Introduzir Produto na prateleira
		
		System.out.println("Deseja introduzir algum produto na prateleira (S/N)?");
		String answer = Reader.read().toUpperCase();
		if (answer.equals("S")) {
			long idProduto = 0;
			while (idProduto == 0) {
				ProductRepository.getInstance().getEntity();
				System.out.println("Introduza o ID do Produto:");
				idProduto = Seeker.SeekProductID(); 
			}
			// INTRODUZIR QUANTIDADE 
			DFSDFSDFSDFSDFF
		} else {
			System.out.println("Prateleira vazia.");
			
		}
		
		System.out.println("");
		
		System.out.println("### PRATELEIRA CRIADA COM SUCESSO! ###");
		System.out.println("**************************************	");
		System.out.println("");
	
		//ShelfRepository.getInstance().createEntity(shelf);
		
	
	
		return false;
	}

}

