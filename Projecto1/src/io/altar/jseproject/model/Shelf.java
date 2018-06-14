package io.altar.jseproject.model;

import io.altar.jseproject.textinterface.Entity;

public class Shelf extends Entity{
	private long ID;
	private int capability; // perceber qual e o objectivo deste atributo para pereber a classe correcta.
	private Product productOnShelf;
	private double rentPrice;
	
	

	
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

	@Override
	public void createNew() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}


}

