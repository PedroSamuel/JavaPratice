package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.utilities.Reader;
import io.altar.jseproject.utilities.Seeker;



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
		long shelfId = shelfs.createEntity(shelf);
		
		if (products.getIndexesSet().size() > 0){
			System.out.println("Deseja introduzir algum produto na prateleira (S/N)?");
			String answer = Reader.read().toUpperCase();
			if (answer.equals("S")) {
				setProductToShelf(shelfId);
			} else {
				System.out.println("Prateleira vazia.");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("### PRATELEIRA CRIADA COM SUCESSO! ###");
		System.out.println("**************************************	");
		System.out.println("");

		return false;
	}

	
	public static long setProductToShelf(long shelfId){
		int capability = 0;
		long idProduct = 0;
		
		while (idProduct == 0) {
			System.out.println("Introduza o ID do Produto a inserir:");
			idProduct = Seeker.SeekProductID(); 

		}	
		
		shelfs.getEntity(shelfId).setProductOnShelf(products.getEntityPrint(idProduct));
		//products.getEntity(idProduct).setOnShelf(shelf);; Irrelevante?
		while(capability == 0){
			System.out.println("Que quantidade deseja introduzir na prateleira?");
			capability = Reader.readInt();
			if (capability == 0){
				System.out.println("Quantidade Invalida.");
			}
			
		} 
		shelfs.getEntity(shelfId).setCapability(capability);
		products.getEntity(idProduct).setOnShelf(shelfs.getEntity(shelfId));
		return idProduct;
		

	}
}

