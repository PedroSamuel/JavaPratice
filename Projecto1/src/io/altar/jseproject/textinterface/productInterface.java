package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Product;


public abstract class productInterface extends TextInterface{
	
	//############################ CRIAR PRODUTO #########################
	public static void newProduct(){
		System.out.println("Novo Produto:");
		
		
		System.out.println("Introduza o nome do produto a criar.");
		String name = scanner.nextLine();
		
		
		double price = 0.0;
		do {
		System.out.println("Introduza o preço do produto a criar.");
	    String sPrice = scanner.nextLine();
		
		
			price = Utilities.toDouble(sPrice, 0.0);
			if (price == 0.0){
				System.out.println(sPrice + " - nao e um valor de preço valido.");
			}
		}while (price == 0.0);
		
		double iva = 0.0;
		do {
		System.out.println("Introduza o valor do IVA aplicado no preço do produto.");
		String sIva = scanner.nextLine();
		
		
			iva = Utilities.toDouble(sIva, 0.0);
			if (iva > 1.0){
				iva = (iva / 100);}
			if ((price == 0.0) || (!Product.validIva.contains(iva))){
				iva = 0.0;
				System.out.println("Apenas valores de 6%, 13% ou 23% sao validos.");}
		} while (iva == 0.0);
		Product product1 = new Product(name, price, iva);
		System.out.println("Produto Criado!");
		System.out.println("ID: " + (product1.getID()+1) + "\nnome: " +  product1.getName() + "\npreço: " + product1.getPvp() + "euros \nIVA: " + (int)(product1.getIva()*100) + "% ");
		System.out.println("Prima enter para continuar.");
		scanner.nextLine();
	
	}
	
	
	
}
