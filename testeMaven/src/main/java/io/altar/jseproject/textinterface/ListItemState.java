package io.altar.jseproject.textinterface;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class ListItemState implements State{
	private String item;
	boolean valid = false;

	//############CONSTRUCTOR#################
	public ListItemState(String item) {
		this.item = item;
	}

	@Override
	public boolean runState() {
		System.out.println("#### LISTAR " + item.toUpperCase() + "S ####");
		System.out.println("");

			if (this.item.equals("Produto")){		
				if (ProductRepository.getInstance().getIndexesSet().size() > 0){
					System.out.println("Produtos Registados:");
					ProductRepository.getInstance().getEntity();
					System.out.println("");	
				} else {
					System.out.println("Nåo existem Produtos registados.");
					System.out.println("");
				}
				
			} else {
				if (ShelfRepository.getInstance().getIndexesSet().size() > 0){
					System.out.println("Prateleiras Registados:");
					ShelfRepository.getInstance().getEntity();
					System.out.println("");
				} else {
					System.out.println("	Nåo existem Prateleiras registadas.");
					System.out.println("");
				}
			}
			
		
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1)	Criar " + this.item);
			int size;
		if (item.equals("Produto")){
			size = (ProductRepository.getInstance().getIndexesSet().size());
		}else {
			size = (ShelfRepository.getInstance().getIndexesSet().size());
		}
		if (size > 0){
			System.out.println("2)	Editar " + this.item);
			System.out.println("3)	Consultar " + this.item);
			System.out.println("4)	Remover" + this.item);
		}
		System.out.println("5)	Voltar ao menu anterior");
		return true;

	}	

}
