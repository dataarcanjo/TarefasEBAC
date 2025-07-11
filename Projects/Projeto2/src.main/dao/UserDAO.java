package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import objects.User;

public class UserDAO extends GenericMapDAO<String, User> implements IUserDAO {

	private Map<String, User> database = new HashMap<String, User>();
	
	@Override
	public void save(String id, User obj) {
		database.put(id, obj);
	}

	@Override
	public void update(String id, User obj) {
		if (database.containsKey(id)) {
	        database.put(id, obj);
	    } else {
	        throw new IllegalArgumentException("ID não encontrado: " + id);
	    }

	}

	@Override
	public void delete(User obj) {
		database.values().remove(obj);

	}

	@Override
	public Collection<User> ListAll() {
		return database.values();
	}

	@Override
	public User findByID(String id) {
		return database.get(id);
	}
}
