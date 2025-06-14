package dao;

import domain.User;
import java.util.Collection;

/**
 *
 * @author Rafael Arcanjo
 */
public interface IUserDAO {
    public Boolean create(User user);
    
    public User read(String cpf);
    
    public void update(User user);
    
    public void delete(String cpf);
    
    public Collection<User> list();
}
