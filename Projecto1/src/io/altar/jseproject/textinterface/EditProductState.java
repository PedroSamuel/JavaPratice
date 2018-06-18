package io.altar.jseproject.textinterface;

public class EditProductState implements State {

	@Override
	public boolean runState() {
		System.out.println("Editar Produto");
		System.out.println("Introduza o ID do produto a editar");
		
		long id = Reader.readfromChoices(choices, defaultVal)
		return false;
	}

}
