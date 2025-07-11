package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenericMapDAO<ID, T> implements dao.IGenericDAO<ID, T> {

	private Map<ID, T> database = new HashMap<>();
	
	@Override
	public void save(ID id, T obj) {
		database.put(id, obj);
	}

	@Override
	public void update(ID id, T obj) {
		if (database.containsKey(id)) {
	        database.put(id, obj);
	    } else {
	        throw new IllegalArgumentException("ID não encontrado: " + id);
	    }
	}

	@Override
	public void delete(T obj) {
		database.values().remove(obj);
		
	}

	@Override
	public Collection<T> ListAll() {
		return database.values();
	}

	@Override
	public T findByID(ID id) {	
		return database.get(id);
	}

}
