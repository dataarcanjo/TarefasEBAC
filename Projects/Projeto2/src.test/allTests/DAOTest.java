package allTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.IGenericDAO;
import objects.User;

public class DAOTest {
	
	private IGenericDAO<String, User> dao = new UserDAOMock();
	
	@Before
	public void initTest() {
		User user1 = new User();
		
	    user1.setCpf("03634627381");
	    user1.setNome("Cleiton Rasta");
	    user1.setCidade("São Paulo");
	    user1.setEnd("Rua do fim do mundo, 666");
	    user1.setEstado("SP");
	    user1.setNumero(69);
	    user1.setTel(11999999999L);
	    dao.save(user1.getCpf(), user1);

	    User user2 = new User();
	    user2.setCpf("29508399245");
	    user2.setNome("Jorginho Pontes");
	    user2.setCidade("São Paulo");
	    user2.setEnd("Rua do fim do mundo, 999");
	    user2.setEstado("SP");
	    user2.setNumero(34);
	    user2.setTel(11999939469L);
	    dao.save(user2.getCpf(), user2);
	}
	
	@Test
	public void updateTest() {
		User user = new User();
		
	    user.setCpf("29508399245");
	    user.setNome("Jorginho Pontes");
	    user.setCidade("Niteroi");
	    user.setEnd("Rua do começo do mundo, 999");
	    user.setEstado("RJ");
	    user.setNumero(64);
	    user.setTel(55119439469L);
	    
		dao.update("29508399245", user);
		
		Assert.assertEquals("Niteroi", dao.findByID("29508399245").getCidade());
	}
	
	@Test
	public void listAllTest() {
		for (User c : dao.ListAll()) {
			System.out.println(c.getNome());
		}
		Assert.assertTrue(dao.ListAll().size() == 2);
	}
}
