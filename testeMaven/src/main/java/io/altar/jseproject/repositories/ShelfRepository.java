package io.altar.jseproject.repositories;
import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{

	public ShelfRepository() {
		super();
	}
	
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	public static ShelfRepository getInstance() {
		return INSTANCE;
	}

}
