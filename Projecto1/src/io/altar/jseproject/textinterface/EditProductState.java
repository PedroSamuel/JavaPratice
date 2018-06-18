package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class EditProductState implements State {

	@Override
	public boolean runState() {
		System.out.println("#### EDITAR PRODUTO ####");
		System.out.println("");
		
		
		System.out.println("Introduza o ID do produto a editar.");
		long id = Reader.readfromChoices((ProductRepository.getInstance().getIndexesArray()), 0);
		if (id != 0) {
			editProduct(id);
		} else {
			System.out.println("XX    ID não válido     XX");
			System.out.println("_________________________________");
			System.out.println("");
		}
		
		
		return false;
	}

	private void editProduct(long id) {
		Product product = ProductRepository.getInstance().getEntity(id);
		System.out.println("*******************************");
		System.out.println("Editar (prima enter para manter)");
		System.out.println("");
		System.out.println("Nome do produto: " + product.getName());
		String name = Reader.read();
		if (!name.equals("")) {
			product.setName(name);
			System.out.println("Nome Editado!");
		} else {
			System.out.println("Nome Mantido!");
		}
		System.out.println("");
		System.out.println("Preço do produto: " + product.getPvp() + "€");
		
		double price = 0.0;
		do {
			String sPrice = Reader.read();
			if (!sPrice.equals("")) {
				price = Reader.toDouble(sPrice, 0.0);
				if (price == 0.0){
					System.out.println(sPrice + " - nao e um valor de preço valido.");
				} else {
					System.out.println("Valor Alterado!");
					product.setPvp(price);
				}
			} else {
				System.out.println("Valor Mantido.");
				price = product.getPvp();
				
			}
		} while (price == 0.0);
		
		System.out.println("*******************************");
		System.out.println("Iva do Produto: " + product.getIva()*100 + "%");
		double iva = 0.0;
		do {
			System.out.println("Introduza o valor do IVA aplicado no preço do produto.");
			String sIva = Reader.read();
			if (!sIva.equals("")){
				iva = Reader.toDouble(sIva, 0.0);
				if (iva > 1.0){
					iva = (iva / 100);}
				if ((price == 0.0) || (!Product.validIva.contains(iva))){
					iva = 0.0;
					System.out.println("Apenas valores de 6%, 13% ou 23% sao validos.");
				} else {
					System.out.println("Iva Alterado!");
					product.setIva(iva);
				}
			} else {
				System.out.println("Iva Mantido.");
				iva = product.getIva();
			}
			
		} while (iva == 0.0);
		
		Product product1 = new Product(name, price, iva);
		product1.setID(id);
		
		System.out.println("Produto Alterado!");
		ProductRepository.getInstance().editEntity(product1);
		System.out.printf("ID: %d \nnome: %s \npreço: %.2f euros \nIVA: %d", product1.getID() , product1.getName(),(float)product1.getPvp(),(int)(product1.getIva()*100));
		System.out.println("%");
		System.out.println("Prima enter para continuar.");
	Reader.read();
	}

}
