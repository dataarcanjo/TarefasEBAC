package dao;

import domain.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael Arcanjo
 */
public class UserMapDAO implements IUserDAO{

    private Map<String, User> map;
    
    public UserMapDAO(){
        this.map = new HashMap<>();
    }
    
    @Override
    public Boolean create(User user) {
        if (this.map.containsKey(user.getCpf()) || this.map.containsKey(null)){
            return false;
        }
        this.map.put(user.getCpf(), user);
        return true;
    }

    @Override
    public User read(String cpf) {
        return this.map.get(cpf);
    }

    @Override
    public void update(User user) {
        if (this.map.containsKey(user.getCpf())){
            this.map.replace(user.getCpf(), user);
        }
    }

    @Override
    public void delete(String cpf) {
        User registeredUser = this.map.get(cpf);
        if (registeredUser != null){
            this.map.remove(cpf);
        }
    }

    @Override
    public Collection<User> list() {
       return this.map.values();
    }
    
}
