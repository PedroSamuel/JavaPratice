package io.altar.jseproject.textinterface;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class EditProductState implements State {

	@Override
	public boolean runState() {
		if ( ProductRepository.getInstance().getIndexesSet().size() == 0){
			System.out.println("XX Opção não válida. XX");
			return false;
		}
		
		System.out.println("#### EDITAR PRODUTO ####");
		System.out.println("");

		long id = 0;
		String repeat = ("N");
		  do {	
			 System.out.println("Introduza o ID do produto a editar.");
			 id = Seeker.SeekProductID();
			 if (id != 0){		
				 editProduct(id);
			 }
			 System.out.println("Deseja introduzir outro ID de Produto  (S/N)");
			 repeat = Reader.read();

		} while (repeat.toUpperCase().equals("S"));
		return false;
	}

	private void editProduct(long id) {
		Product product = ProductRepository.getInstance().getEntity(id);
		System.out.println("*******************************");
		System.out.println("");
		System.out.println("Nome do produto: " + product.getName());
		System.out.println("Introduza o novo nome do produto (prima ENTER para manter)");
		String name = Reader.read();
		if (!name.equals("")) {
			product.setName(name);
			System.out.println("Nome Editado!");
		} else {
			System.out.println("Nome Mantido!");
		}
		System.out.println("");
		System.out.println("Preço do produto: " + product.getPvp() + "€.");
		
		double price = 0.0;
		do {
			System.out.println("Introduza o novo valor do preço do produto. (prima ENTER para manter)");
			String sPrice = Reader.read();
			if (!sPrice.equals("")) {
				price = Reader.toDouble(sPrice, 0.0);
				if (price == 0.0){
					System.out.println(sPrice + " - nao e um valor de preço valido. ");
				} else {
					System.out.println("Valor Alterado!");
					product.setPvp(price);
				}
			} else {
				System.out.println("Valor Mantido.");
				price = product.getPvp();
				
			}
		} while (price == 0.0);
		
		System.out.println("");
		System.out.println("Iva do Produto: " + product.getIva()*100 + "%");
		double iva = 0.0;
		do {
			System.out.println("Introduza o novo valor do IVA aplicado ao preço do produto. (prima enter para manter)");
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
		ProductRepository.getInstance().editEntity(product1);
	}

}
