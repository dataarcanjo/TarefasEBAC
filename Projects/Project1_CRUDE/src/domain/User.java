package domain;

import java.util.Objects;

/**
 *
 * @author Rafael Arcanjo
 */
public class User {
    String cpf;
    String name;
    String sex;
    String number;
    String city;
    String state;

    public User(String cpf, String name, String sex, String number, String city, String state) {
        this.cpf = cpf.trim();
        this.name = name.trim();
        this.sex = sex.trim();
        this.number = number.trim();
        this.city = city.trim();
        this.state = state.trim();
    }
    
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object user) {
        if (this == user) {
            return true;
        }
        if (user == null) {
            return false;
        }
        if (getClass() != user.getClass()) {
            return false;
        }
        final User other = (User) user;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
}
