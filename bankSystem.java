import java.util.HashMap;

public class bankSystem{
    private HashMap<String, User> users = new HashMap<>();
    private HashMap<String, Account> accounts = new HashMap<>();
    private HashMap<String, Account> userAccounts = new HashMap<>();

    public HashMap<String, User> getUsers() {
        return users;
    }
    public HashMap<String, Account> getAccounts() {
        return accounts;
    }
    public HashMap<String, Account> getUserAccounts() {
        return userAccounts;
    }

    public void createUser(String userId, String name, String email, String password){
        if(users.containsKey(userId)){
            System.out.println("User already exists.");
        }
        else{
            User user = new User(userId, name, email, password);
            users.put(userId, user);
            System.out.println("User has been created for " + user.getName());
        }
    }
}