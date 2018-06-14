package io.altar.jseproject.textinterface;

public abstract class Entity {
	private Long ID;

	public Entity(){
		this.ID = ID++;
	}
	
	public abstract void createNew();
		
	public abstract void edit();
	
	public abstract void delete();
	
	public abstract void list();
	
	public abstract long getID();
	
}
