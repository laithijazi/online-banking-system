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
}