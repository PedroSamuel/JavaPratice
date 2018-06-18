package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

//import io.altar.jseproject.model.Product;


public class CreateProductState implements State{
		
	@Override
	public boolean runState() {	
		
		System.out.println("Novo Produto:");
		
		System.out.println("Introduza o nome do produto a criar.");
		String name = Reader.read();
	
		
		double price = 0.0;
		do {
		System.out.println("Introduza o preço do produto a criar.");
	    String sPrice = Reader.read();
		
			price = Reader.toDouble(sPrice, 0.0);
			if (price == 0.0){
				System.out.println(sPrice + " - nao e um valor de preço valido.");
			}
		}while (price == 0.0);
		
		double iva = 0.0;
		do {
		System.out.println("Introduza o valor do IVA aplicado no preço do produto.");
		String sIva = Reader.read();
			iva = Reader.toDouble(sIva, 0.0);
			if (iva > 1.0){
				iva = (iva / 100);}
			if ((price == 0.0) || (!Product.validIva.contains(iva))){
				iva = 0.0;
				System.out.println("Apenas valores de 6%, 13% ou 23% sao validos.");}
		} while (iva == 0.0);
		Product product1 = new Product(name, price, iva);
		
		System.out.println("Produto Criado!");
		ProductRepository.getInstance().createEntity(product1);
		System.out.printf("ID: %d \nnome: %s \npreço: %.2f euros \nIVA: %d", product1.getID() , product1.getName(),(float)product1.getPvp(),(int)(product1.getIva()*100));
		System.out.println("%");
		System.out.println("Prima enter para continuar.");
	Reader.read();
	
		return false;
	}

}
