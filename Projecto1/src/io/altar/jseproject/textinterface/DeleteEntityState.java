package io.altar.jseproject.textinterface;

import io.altar.jseproject.repositories.ProductRepository;

public class DeleteEntityState implements State {
	String item;

	public DeleteEntityState(String item) {
		super();
		this.item = item;
	}

	@Override
	public boolean runState() {
		
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
									ProductRepository.getInstance().removeEntity(id);
									System.out.println("Produto Removido com Sucesso!!");
								} else {
									System.out.println("Produto não removido.");
								}
						}
						break;
					case("Prateleira"):
						id = Seeker.SeekProductID();
						if (id != (long)0) {
							System.out.println("Tem a certeza que deseja eliminar este Produto? (S/N)");
							String answer = Reader.read().toUpperCase();
								if (answer.equals("S")){
									ProductRepository.getInstance().removeEntity(id);
									System.out.println("Produto Removido com Sucesso!!");
								} else {
									System.out.println("Produto não removido.");
								}
						}
						break;
				}
						
				System.out.println("Deseja introduzir outro ID de item a eliminar? (S/N)");
				repeat = Reader.read().toUpperCase();
				 
			}while (repeat.equals("S"));
		return false;
		
	}

}
