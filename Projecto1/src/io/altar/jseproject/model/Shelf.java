package io.altar.jseproject.model;

public class Shelf {
	public int shelfId;
	public int capability; // perceber qual e o objectivo deste atributo para pereber a classe correcta.
	public Product productOnShelf;
	public double price;

	
		//setters
	public void setShelfId(int shelfId){
		this.shelfId = shelfId;
	}
	
	public void setCapability(int capability) {
		this.capability = capability;
	}			
		
	public void setProductOnShelf(Product prod){
		this.productOnShelf = prod;
	}
	
	public void setPrice(double price) {
			this.price = price;
	}
	
	//getters
		
	public int getShelfId(){
		return this.shelfId;
		}

	public int getCapability() {
		return this.capability;
	}



	public Product getProductOnShef() {
		return this.productOnShelf;
	}

	public double getPrice() {
		return this.price;
	}


}

