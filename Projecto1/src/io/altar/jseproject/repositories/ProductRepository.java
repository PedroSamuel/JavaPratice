package io.altar.jseproject.repositories;
import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product>{

	private ProductRepository() {
		super();
	}
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return INSTANCE;
	}
	

}
