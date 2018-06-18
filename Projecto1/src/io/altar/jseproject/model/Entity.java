package io.altar.jseproject.model;

public abstract class Entity {
	private long ID;
	
	public Entity() {
	}

	public long getID(){
		return this.ID;
	}
	
	public void setID(long ID) {
		this.ID = ID;
	}
}
