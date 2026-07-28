package br.com.dataarcanjo.dao;

import java.io.Serializable;

public interface GenericDAO <T extends Persistent, E extends Serializable> {
	public void save(T entity);
	
	public T findById(E id);
	
	public void update(T entity);
	
	public void delete(T entity);
}
