package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import objects.User;

public class TestsUser {
	User user = new User("Rafael", 'm');
	
	@Test
	public void testGetName() {
		Assert.assertEquals("Rafael", user.getName());
	}

	@Test
	public void testGetSex() {
		fail("Not yet implemented");
	}


}
