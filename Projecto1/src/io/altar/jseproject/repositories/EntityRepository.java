package io.altar.jseproject.repositories;
import java.util.HashMap;
import io.altar.jseproject.model.Entity;

 
public abstract class EntityRepository <T extends Entity> {	
	
	private HashMap<Long, T> repository = new HashMap<>(); //public ??
	private long LargestID = 0;
	
	
	
	private long nextId(){
		return ++LargestID;
	
	}
	
	public long createEntity(T ob){
		ob.setID(nextId());
		repository.put(ob.getID(),ob);
		return LargestID; 
	}
	
	public void getEntity(){
		for (T entity : repository.values()) {
			System.out.println(entity);
		}
	}
		
	public void getEntity(long ID) {
		T entity = repository.get(Long.valueOf(ID));
		System.out.println(entity);
		
	}	
	
	public void editEntity(T entity) {
		repository.put(entity.getID(), entity);
	}
	
	public void removeEntity(long ID){
		repository.remove(Long.valueOf(ID));
	}

	@Override
	public String toString() {
		return "EntityRepository [repository= " + repository + ", LargestID=" + LargestID + "]";
	}
	
	
}
	

	

