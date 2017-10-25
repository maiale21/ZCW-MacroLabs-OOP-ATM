package user;

public class UserFactory {

    private UserFactory(){

    }

    public static User createNewUser(){
        //must add account array list
        String userName = UserInput.getString("Enter Username:");
        String userPassword = UserInput.getString("Enter Password:");

        User newUser = new User(userName, userPassword);
        return createNewUser(userName, userPassword);
    }
    public static User createNewUser(String userName, String userPassword){
        //must add account array list

        User newUser = new User(userName, userPassword);
        return newUser;
    }


}
