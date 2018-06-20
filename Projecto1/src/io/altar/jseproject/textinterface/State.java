package io.altar.jseproject.textinterface;


import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public interface State {
	public static ProductRepository products = ProductRepository.getInstance();
	public static ShelfRepository shelfs = ShelfRepository.getInstance();


	public boolean runState();
	
	
}
