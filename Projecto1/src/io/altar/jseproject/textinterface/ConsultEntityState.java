package io.altar.jseproject.textinterface;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class ConsultEntityState  implements State {
	String item;
	
	
	
	public ConsultEntityState() {
		super();
	
	}
	
	public ConsultEntityState(String item) {
		super();
		this.item = item;	
	
	}

	@Override
	public boolean runState() {
		System.out.println("#### CONSULTAR " + item.toUpperCase() + "####");
		System.out.println("");
		long id = 0;
		
		switch (item) {
			case("Produto"):
				System.out.println("Introduza o ID a consultar");
				id = Seeker.SeekProductID();
				if (id != 0) {
					ProductRepository.getInstance().getEntity(id);
				} else {
					System.out.println("XX    ID não válido     XX");
					System.out.println("_________________________________");
					System.out.println("");
				}
			break;
			case("Prateleira"):
				System.out.println("Introduza o ID a consultar");
				id = Seeker.SeekShelfID();
				if (id != 0) {
					ShelfRepository.getInstance().getEntity(id);
				} else {
					System.out.println("XX    ID não válido     XX");
					System.out.println("_________________________________");
					System.out.println("");
				}
			break;
			default:
				System.out.println("Erro!!!!");
			break;
	
		}
		return false;
		
	}

}
