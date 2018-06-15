package io.altar.jseproject.repositories;
import java.util.HashMap;
import java.util.LinkedHashMap;
import io.altar.jseproject.model.Entity;

 
public abstract class EntityRepository <T extends Entity> {	
	
	private HashMap<Long, T> repository = new HashMap<>(); //public ??
	private long LargestID = 1;
	
	
	private long nextId(){
		return LargestID + 1;
	}
	
	public Long Create(T ob){
		//ob.setID(nextId())
		repository.put(nextId(), ob);
		
		return LargestID++; 
	}
	
//	EntityRepository(T ob){
//	Long ID = ob.getID();
//			
//		}
	}
	

