package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class EditShelfState implements State {

	@Override
	public boolean runState() {
		
		if ( ShelfRepository.getInstance().getIndexesSet().size() == 0){
			System.out.println("XX Opção não válida. XX");
			return false;
		}


		System.out.println("#### EDITAR PRATELEIRAS ####");
		System.out.println("");

		long id = 0;
		String repeat = ("N");
		  do {	
			  System.out.println("Introduza o ID da Prateleira a editar.");
			 id = Seeker.SeekShelfID();
			 if (id != 0){		
				 editShelf(id);
			 }
			 System.out.println("Deseja introduzir outro ID de Prateleira  (S/N)");
			 repeat = Reader.read();

		} while (repeat.toUpperCase().equals("S"));
		return false;
	}

	private void editShelf(long id) {
		Shelf shelf = ShelfRepository.getInstance().getEntity(id);
		System.out.println("*******************************");
		System.out.println("");
		
		double price = 0.0;
		do {
			
			System.out.println("Preço diario do aluguer da Prateleira: " + shelf.getRentPrice() + "€");
			System.out.println("Introduza o valor do novo preço (prima ENTER para manter)");
			String sPrice = Reader.read();
			if (!sPrice.equals("")) {
				
					price = Reader.toDouble(sPrice, 0.0);
					if (price == 0.0){
						System.out.println("Introduza um valor de preço valido.");
					} else { 
						System.out.println("Preço Editado!");
						shelf.setRentPrice(price);
						ShelfRepository.getInstance().editEntity(shelf);
					}
			} else {
				System.out.println("Preço Mantido!");
				price = shelf.getRentPrice();
			}
		} while (price == 0.0);
		
		if (ProductRepository.getInstance().getIndexesSet().size() > 0){
			EditProductToShelf(shelf);
		}
	}
	

	private void EditProductToShelf(Shelf shelf) {
		
		boolean exit;
		do{
			exit = true;
			if (shelf.getProductOnShelf() == null){
				
				System.out.println("Prateleira Vazia.");
				
				System.out.println("Deseja introduzir um novo Produto? (S/N)");
				if (Reader.read().toUpperCase().equals("S")){
					shelf = CreateShelfState.setProductToShelf(shelf);
					exit = false;
				}
			} else {
				System.out.println("Produto na Prateleira: " + shelf.getProductOnShelf() + ", Quantidade: " + shelf.getCapability());
				System.out.println("Opçoes (prima qualquer outra tecla para continuar): ");
				System.out.println("1) Alterar Produto");
				System.out.println("2) Alterar Quantidade");
				System.out.println("3) Eliminar Produto");
				int[] choices = {1,2,3};
				int choice = Reader.readfromChoices(choices, 0);
				switch(choice){
					case 1: 
						shelf = CreateShelfState.setProductToShelf(shelf);
						exit = false;
						break;
					case 2: 
						int capability = 0;
						while(capability == 0){
							System.out.println("Que quantidade deseja introduzir na prateleira?");
							capability = Reader.readInt();
							if (capability == 0){
								System.out.println("Quantidade Invalida.");
							}
						}	
						shelf.setCapability(capability);
						exit = false;
						break;
					case 3:
						System.out.println("Produto Eliminado");
						shelf.setCapability(0);
						shelf.setProductOnShelf(null);
						exit = false;
						break;
						
				}			
			}
		} while (exit == false);
	}
}

