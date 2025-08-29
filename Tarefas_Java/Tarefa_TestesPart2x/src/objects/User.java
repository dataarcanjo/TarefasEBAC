package objects;

import java.util.Objects;

public class User {
	
	private String name;
	private char sex;
	
	
	
	public User(String name, char sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public char getSex() {
		return sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
