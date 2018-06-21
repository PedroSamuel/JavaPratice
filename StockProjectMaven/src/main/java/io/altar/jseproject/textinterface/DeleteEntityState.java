package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.utilities.Reader;
import io.altar.jseproject.utilities.Seeker;

public class DeleteEntityState implements State {
	String item;

	public DeleteEntityState(String item) {
		super();
		this.item = item;
	}

	@Override
	public boolean runState() {
		int size;
		if (item.equals("Produto")){
			size = (ProductRepository.getInstance().getIndexesSet().size());
		}else {
			size = (ShelfRepository.getInstance().getIndexesSet().size());
		}
		if (size == 0){
			System.out.println("XX Opção não válida. XX");
			return false;
		}
		
		System.out.println("#### ELIMINAR " + item.toUpperCase() + "####");
		System.out.println("");
		
		
		
		
		String repeat;
			do{
				repeat = "N";
				System.out.println("Introduza o ID do item a eliminar");
				long id = 0;
				switch(item) {
				
					case("Produto"):
						id = Seeker.SeekProductID();
						if (id != (long)0) {
							System.out.println("Tem a certeza que deseja eliminar este Produto? (S/N)");
							String answer = Reader.read().toUpperCase();
								if (answer.equals("S")){
									for (Shelf shelf: products.getEntity(id).getOnShelfs()){
										shelf.removeProductFromShelf();
									}
									products.removeEntity(id);
									System.out.println("Produto Removido com Sucesso!!");
								} else {
									System.out.println("Produto não removido.");
								}
						}
						break;
					case("Prateleira"):
						id = Seeker.SeekShelfID();
						if (id != (long)0) {
							System.out.println("Tem a certeza que deseja eliminar esta Prateleira? (S/N)");
							String answer = Reader.read().toUpperCase();
								if (answer.equals("S")){
									try{
										shelfs.getEntity(id).getProductOnShelf().removeFromShelf(shelfs.getEntity(id));
									} catch(NullPointerException e){
										}
									
									shelfs.removeEntity(id);
									
									System.out.println("Prateleira Removida com Sucesso!!");
									};
								} else {
									System.out.println("Prateleira não removida.");
								}
						break;
				}
						
				System.out.println("Deseja introduzir outro ID de item a eliminar? (S/N)");
				repeat = Reader.read().toUpperCase();
				 
			}while (repeat.equals("S"));
		return false;
		
	}

}
