package io.altar.jseproject.model;
import java.util.ArrayList;
import java.util.List;



public class Product extends Entity{
	private String name;
	private ArrayList<Shelf> onShelfs = new ArrayList<>(); 
	private double iva;
	private double pvp;
	//private double discount;
	//private double price;
	
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

	public void setOnShelf(Shelf shelf) {
		this.onShelfs.add(shelf);
	}	
	
	public void removeFromShelf(Shelf shelf){
		//if (this.onShelfs.contains(shelf)){
		try{
			this.onShelfs.remove(shelf);
	
		} catch(NullPointerException e) {
			System.out.println("O produto nåo se encontra na prateleira.");
		}
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
		
		return ("ID: " + getID() + ") Nome: " + getName() + ", pvp: " + pvp + "€, iva: " + (iva*100) + "% ");
	}
	
	@Override
	public void getDetails(){
		System.out.println("ID do produto: " + getID());
		System.out.println("Nome do produto: " + getName());
		System.out.println("PVP: " + getPvp() + "€");
		System.out.println("IVA): " + (getIva()*100) + "%");
		// if (this.onShelfs.size() > 0){
		try{
			System.out.print("Producto nas Prateleiras: {");
			for (Shelf shelf: this.onShelfs){
				System.out.print("[ID: " + shelf.getID() + ", quantidade: " + shelf.getCapability() + "], ");

			}
		System.out.println("}");
		} catch (NullPointerException e){
			System.out.println("Este produto ainda no existe em nenhuma prateleira. ");
		}
		//System.out.println("Desconto Aplicado :");
	
	}

	
		
		
		
}
