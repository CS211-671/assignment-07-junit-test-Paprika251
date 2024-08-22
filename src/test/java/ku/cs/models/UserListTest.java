package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User user ;
        userList.addUser("John" , "abc");
        userList.addUser("Jane" , "def");
        userList.addUser("Jack" , "ghi");
        // TODO: find one of them
        user = userList.findUserByUsername("John");
        // TODO: assert that UserList found User
         String expected = "John";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("John" , "abc");
        userList.addUser("Jane" , "def");
        userList.addUser("Jack" , "ghi");
        // TODO: change password of one user
        boolean actual = userList.changePassword("John" , "abc" , "xyz");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John" , "abc");
        userList.addUser("Jane" , "def");
        userList.addUser("Jack" , "ghi");
        // TODO: call login() with correct username and password
        User actual = userList.login("Jane", "xyz");
        User expected = userList.findUserByUsername("Jann");
        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("John" , "abc");
        userList.addUser("Jane" , "def");
        userList.addUser("Jack" , "ghi");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Jane", "jkl");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}