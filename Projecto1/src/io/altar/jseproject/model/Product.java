package io.altar.jseproject.model;
import java.util.ArrayList; // referencia arraylist http://www.javaprogressivo.net/2012/09/como-usar-arraylist-em-java.html
import java.util.List;



public class Product extends Entity{
	private String name;
	private ArrayList<Shelf> onShelfs; //???????
	private double iva;
	private double pvp;
	
	public static final List<Double> validIva = new ArrayList<>();
	static {
		validIva.add(0.06);
		validIva.add(0.13);
		validIva.add(0.23);
		}
		
	//#################### CONSTRUCTOR ################################ //
	public Product(String name, double pvp, double iva) {
		super(); 
		this.setName(name);
		this.setIva(iva);
		this.setPvp(pvp);
	}

	//______________________Getters e Setters _________________________ //
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setOnShelfs(ArrayList<Shelf> onShelfs) {
		this.onShelfs = onShelfs;
	}	
	
	public ArrayList<Shelf> getOnShelfs() {
		return onShelfs;
	}
		
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public double getIva() {
		return iva;
	}

	
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}	
	
	public double getPvp() {
		return pvp;
	}
	//____________________________________________________________________//


	@Override
	public String toString() {
		
		return (getID() + " [Nome: " + getName() + ", pvp: " + pvp + "€, iva: " + (iva*100) + "% ]");
	}

	
		
		
		
}
