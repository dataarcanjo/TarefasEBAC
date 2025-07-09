package beta;

import java.util.List;

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
	
	public List<User> fillUsers(){
		User pessoa1 = new User("Rafael Arcanjo", 'm');
		User pessoa2 = new User("Rafaela Caetano", 'f');
		User pessoa3 = new User("Matheus Henrique", 'm');
		User pessoa4 = new User("Lara Mattos", 'f');

		return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
	}
}
