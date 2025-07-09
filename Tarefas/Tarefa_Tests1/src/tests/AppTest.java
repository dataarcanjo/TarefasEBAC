package tests;

import java.util.List;
import beta.User;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    

    @Test
    public void mainTest(){
        User tUser = new User("x", 'x');

        List<User> users = tUser.fillUsers();
        
        List<User> onlyWoman = users.stream()
                                    .filter(user -> user.getSex() == 'f')
                                    .toList();
        
        boolean allAreWoman = onlyWoman.stream()
                                       .allMatch(user -> user.getSex() == 'f');

        Assert.assertEquals(true, allAreWoman);
    }
}
