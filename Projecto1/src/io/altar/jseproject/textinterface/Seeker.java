package io.altar.jseproject.textinterface;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public interface Seeker {
	
	public static long SeekProductID() {
		long id = Reader.readfromChoices((ProductRepository.getInstance().getIndexesArray()), 0);
		if (id != 0) {
			ProductRepository.getInstance().getEntity(id);
			return id;
		} else {
			System.out.println("XX    ID não válido     XX");
			System.out.println("_________________________________");
			System.out.println("");	
			return 0;
		}
	
	}
	
	public static long SeekShelfID() {
		long id = Reader.readfromChoices((ShelfRepository.getInstance().getIndexesArray()), 0);
		if (id != 0) {
			ShelfRepository.getInstance().getEntity(id);
			return id;
		} else {
			System.out.println("XX    ID não válido     XX");
			System.out.println("_________________________________");
			System.out.println("");	
			return 0;
		}
	
	}
}
