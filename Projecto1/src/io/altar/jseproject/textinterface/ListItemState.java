package io.altar.jseproject.textinterface;

import io.altar.jseproject.repositories.ProductRepository;

public class ListItemState implements State{
	private String item;
	boolean valid = false;

	//############CONSTRUCTOR#################
	public ListItemState(String item) {
		this.item = item;
	}

	@Override
	public boolean runState() {
	
			if (this.item.equals("Produto")) {
				ProductRepository.getInstance().getEntity();
				
		} else {
			// listar prateleiras
		}
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1)	Criar " + this.item);
		System.out.println("2)	Editar " + this.item);
		System.out.println("3)	Consultar " + this.item);
		System.out.println("4)	Remover" + this.item);
		System.out.println("5)	Voltar ao menu anterior");
		return true;

	}	

}
