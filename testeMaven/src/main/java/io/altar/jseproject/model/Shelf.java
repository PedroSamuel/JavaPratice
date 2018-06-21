package io.altar.jseproject.model;





public class Shelf extends Entity{
	private int capability; // perceber qual e o objectivo deste atributo para perceber a classe correcta.
	private Product productOnShelf;
	private double rentPrice;
	
		
	//#################### CONSTRUCTOR ################################ //

	
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
		//prod.setOnShelf(this);
	}
	
	public void removeProductFromShelf(){
		this.productOnShelf.removeFromShelf(this);
		this.productOnShelf = null;
		this.setCapability(0);
		
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
			return ("ID: " + getID() + ") Preço Aluguer (Dia): " + getRentPrice() + "€, Produto na Prateleira: [ ID:" + productOnShelf.getID() + ") " +  productOnShelf.getName() + ", Quantidade: " + capability + "]");
		}
	}

	@Override
	public void getDetails() {
		System.out.println("ID: " + getID());
		System.out.println("Preço aluguer (diario); " + getRentPrice());
		if (this.getProductOnShelf() != null){
			System.out.println("Produto na prateleira: [" + getProductOnShelf() + "]");
			System.out.println("Quantidade: " + getCapability());
		} else {
			System.out.println("Prateleira Vazia");
		}
		
	}
	
}

