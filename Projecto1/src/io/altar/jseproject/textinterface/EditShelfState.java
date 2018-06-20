package io.altar.jseproject.textinterface;


import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.utilities.Reader;
import io.altar.jseproject.utilities.Seeker;

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
		System.out.println("*******************************");
		System.out.println("");
		
		double price = 0.0;
		do {
			
			System.out.println("Preço diario do aluguer da Prateleira: " + shelfs.getEntity(id).getRentPrice() + "€");
			System.out.println("Introduza o valor do novo preço (prima ENTER para manter)");
			String sPrice = Reader.read();
			if (!sPrice.equals("")) {
				
					price = Reader.toDouble(sPrice, 0.0);
					if (price == 0.0){
						System.out.println("Introduza um valor de preço valido.");
					} else { 
						System.out.println("Preço Editado!");
						shelfs.getEntity(id).setRentPrice(price);
					}
			} else {
				System.out.println("Preço Mantido!");
				price = shelfs.getEntity(id).getRentPrice();
			}
		} while (price == 0.0);
		
		if (products.getIndexesSet() != null){
			EditProductToShelf(id);
		}
	}
	

	private void EditProductToShelf(long id) {
		boolean exit;
		do{
			exit = true;
			if (shelfs.getEntity(id).getProductOnShelf() == null){
				
				System.out.println("Prateleira Vazia.");
				
				System.out.println("Deseja introduzir um novo Produto? (S/N)");
				if (Reader.read().toUpperCase().equals("S")){
					CreateShelfState.setProductToShelf(id);
					exit = false;
				}
			} else {
				System.out.println("Produto na Prateleira: " + shelfs.getEntity(id).getProductOnShelf() + ", Quantidade: " + shelfs.getEntity(id).getCapability());
				System.out.println("Opçoes : ");
				System.out.println("1) Alterar Produto");
				System.out.println("2) Alterar Quantidade");
				System.out.println("3) Eliminar Produto");
				System.out.println("?) (prima qualquer outra tecla para continuar)");
				int[] choices = {1,2,3};
				int choice = Reader.readfromChoices(choices, 0);
				switch(choice){
					case 1: 
						try{
							shelfs.getEntity(id).getProductOnShelf().removeFromShelf(shelfs.getEntity(id));
						} catch(NullPointerException e){
							}
						CreateShelfState.setProductToShelf(id);
						exit = false;
						break;
					case 2: 
						int capability = 0;
						while(capability == 0){
							System.out.println("Que quantidade deseja colocar na prateleira?");
							capability = capability + Reader.readInt();
							if (capability <= 0){
								System.out.println("Quantidade Invalida.");
							}
						}	
						shelfs.getEntity(id).setCapability(capability);
						exit = false;
						break;
					case 3:
						
						shelfs.getEntity(id).removeProductFromShelf();
						System.out.println("Produto Eliminado");
						exit = false;
						break;
						
				}			
			}
		} while (exit == false);
	}
}

