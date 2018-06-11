package io.altar.jseproject.model;

import io.altar.jseproject.textinterface.Entity;

public class Shelf extends Entity{
	public long ID;
	public int capability; // perceber qual e o objectivo deste atributo para pereber a classe correcta.
	public Product productOnShelf;
	public double rentPrice;
	
	

	
		public Shelf(int capability, Product productOnShelf, double price) {
		super();
		this.ID = ID++;
		this.capability = capability;
		this.productOnShelf = productOnShelf;
		this.rentPrice = price;
	}

	//setters
//	public void setShelfId(int shelfId){
//		this.shelfId = shelfId;
//	}
//	
	public void setCapability(int capability) {
		this.capability = capability;
	}			
		
	public void setProductOnShelf(Product prod){
		this.productOnShelf = prod;
	}
	
	public void setPrice(double price) {
			this.rentPrice = price;
	}
	
	//getters
		
//	public int getShelfId(){
//		return this.shelfId;
//		}

	public int getCapability() {
		return this.capability;
	}



	public Product getProductOnShef() {
		return this.productOnShelf;
	}

	public double getPrice() {
		return this.rentPrice;
	}


}

