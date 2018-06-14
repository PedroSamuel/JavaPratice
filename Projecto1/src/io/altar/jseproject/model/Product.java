package io.altar.jseproject.model;
import java.util.ArrayList;
// referencia arraylist http://www.javaprogressivo.net/2012/09/como-usar-arraylist-em-java.html
import java.util.List;

import io.altar.jseproject.textinterface.Entity;

public class Product extends Entity{
		private String name;
		private long ID = 0;
		private ArrayList<Shelf> onShelfs; //???????
		private double iva;
		private double pvp;
		public static final List<Double> validIva = new ArrayList<>();
		
	
		static {
			validIva.add(0.06);
			validIva.add(0.13);
			validIva.add(0.23);
		}
		
		public Product(String name, double pvp, double iva) {
		super();
		this.ID = ID++; 
		this.setName(name);
		this.setIva(iva);
		this.setPvp(pvp);
	}

		public long getID() {
			return ID;
		}

		
		public ArrayList<Shelf> getOnShelfs() {
			return onShelfs;
		}
		
		public void setOnShelfs(ArrayList<Shelf> onShelfs) {
			this.onShelfs = onShelfs;
		}
		
		
		public double getIva() {
			return iva;
		}
		
		public void setIva(double iva) {
			this.iva = iva;
		}
		
		
		public double getPvp() {
			return pvp;
		}
		public void setPvp(double pvp) {
			this.pvp = pvp;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
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
		
		
		
}
