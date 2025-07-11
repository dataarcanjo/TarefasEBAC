package dao;

import java.util.Collection;

public interface IGenericDAO<ID, T> {
	
	void save(ID id, T obj);
	void update(ID id, T obj);
	void delete(T obj);
	Collection<T> ListAll();
	T findByID(ID id);
	
}
