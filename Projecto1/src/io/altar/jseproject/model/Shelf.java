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
		
	public Product getProductOnShef() {
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
		return "Shelf [capability=" + capability + ", productOnShelf=" + productOnShelf + ", rentPrice=" + rentPrice
				+ "]";
	}
	

}

