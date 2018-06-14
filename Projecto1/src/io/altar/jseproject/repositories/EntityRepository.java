package io.altar.jseproject.repositories;

import java.util.HashMap;
import java.util.LinkedHashMap;

import io.altar.jseproject.textinterface.Entity;
 
public abstract class EntityRepository<T extends Entity>{	
	LinkedHashMap<Long, T> repository = new LinkedHashMap<Long, T>();
		EntityRepository(T ob){
			Long ID = ob.getID();
			
		
	}
	}
	

