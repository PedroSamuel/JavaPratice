package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;


public class CreateShelfState implements State{
	


	@Override
	public boolean runState() {	
			
		System.out.println("###### NOVA PRATELEIRA: ######");

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
		Shelf shelf = new Shelf(price);
		
		if (ProductRepository.getInstance().getIndexesSet().size() > 0){
			System.out.println("Deseja introduzir algum produto na prateleira (S/N)?");
			String answer = Reader.read().toUpperCase();
			if (answer.equals("S")) {
				shelf = setProductToShelf(shelf);
			} else {
				System.out.println("Prateleira vazia.");
			}
		}
		
		ShelfRepository.getInstance().createEntity(shelf);
		System.out.println("");
		System.out.println("");
		System.out.println("### PRATELEIRA CRIADA COM SUCESSO! ###");
		System.out.println("**************************************	");
		System.out.println("");

		return false;
	}

	
	public static Shelf setProductToShelf(Shelf shelf){
		int capability = 0;
		long idProduct = 0;
		
		while (idProduct == 0) {
			System.out.println("Introduza o ID do Produto a inserir:");
			idProduct = Seeker.SeekProductID(); 
			ProductRepository.getInstance().getEntityPrint(idProduct);
		}
		while(capability == 0){
			System.out.println("Que quantidade deseja introduzir na prateleira?");
			capability = Reader.readInt();
			if (capability == 0){
				System.out.println("Quantidade Invalida.");
			}
		}			
		return new Shelf(capability, ProductRepository.getInstance().getEntity(idProduct), shelf.getRentPrice());

	}
}

