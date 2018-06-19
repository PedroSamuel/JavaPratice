package io.altar.jseproject.model;





public class Shelf extends Entity{
	private int capability; // perceber qual e o objectivo deste atributo para perceber a classe correcta.
	private Product productOnShelf;
	private double rentPrice;
	
		
	//#################### CONSTRUCTOR ################################ //
	public Shelf(int capability, Product productOnShelf, double price) {
			super();
			this.capability = capability;
			this.productOnShelf = productOnShelf;
			this.setRentPrice(price);
	}
	
	public Shelf(double price) {
		super();
		this.capability = 0;
		this.productOnShelf = null;
		this.setRentPrice(price);
}
	
	//______________________Getters e Setters _________________________ //
	
	public void setCapability(int capability) {
		this.capability = capability;
	}			
		
	public int getCapability() {
		return this.capability;
	}
	
	//
		
	public void setProductOnShelf(Product prod){
		this.productOnShelf = prod;
	}
		
	public Product getProductOnShelf() {
		return this.productOnShelf;
	}
	
	//
		
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
	
	public double getRentPrice() {
		return rentPrice;
	}

	//____________________________________________________________________//
	
	@Override
	public String toString() {
		if (this.productOnShelf == null){
			return ("ID: " + getID() + ") Preço Aluguer (Dia): " + getRentPrice() + "€, [ Prateleira Vazia ]");
		}
		else {
			return ("ID: " + getID() + ") Preço Aluguer (Dia): " + getRentPrice() + "€, Produto na Prateleira: [ID:" + productOnShelf.getID() + ") " +  productOnShelf.getName() + ", Quantidade: " + capability);
		}
	}
	
}

