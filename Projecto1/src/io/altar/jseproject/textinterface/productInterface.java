package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Product;


public abstract class productInterface extends TextInterface{
	
	
	public static void newProduct(){
		System.out.println("Novo Produto:");
		System.out.println("Introduza o nome do produto a criar.");
		String name = scanner.nextLine();
		System.out.println("Introduza o preço do produto a criar.");
		String sPrice = scanner.nextLine();
		double price = 0.0;
		do { 
			price = Utilities.toDouble(sPrice, 0.0);
			if (price == 0.0){
				System.out.println("Introduza um valor valido para o preço do produto.");
			}
		}while (price == 0.0);
		System.out.println("Introduza o valor do IVA aplicado no preço do produto.");
		String sIva = scanner.nextLine();
		double iva = 0.0;
		do {
			iva = Utilities.toDouble(sIva, 0.0);
			if ((price == 0.0) || (!Product.validIva.contains(iva))){
				System.out.println("Introduza um valor valido de Iva para o produto.");
			} else if (iva > 1.0){
				iva = iva / 100;}
				
			
		} while (iva == 0.0);

	}
	
}
