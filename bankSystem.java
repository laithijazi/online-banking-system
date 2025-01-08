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

    public void createAccount(String accountNumber, String userId, double initialBalance){
        if(accounts.containsKey(accountNumber)){
            System.out.println("Account already exists.");
        }
        else if(!users.containsKey(userId)){
            System.out.println("User not found.");
        }
        else{
            Account account = new Account(accountNumber, userId, initialBalance);
            accounts.put(accountNumber, account);
            userAccounts.put(userId, account);
            System.out.println("Account has been created.");
        }
    }

    public User login(String userId, String password){
        if(users.containsKey(userId)){
            User user = users.get(userId);
            if(user.authenticate(password)){
                return user;
            }
            else{
                System.out.println("Wrong password.");
                return null;
            }
        }
        else{
            System.out.println("User not found.");
            return null;
        }
    }

    public void viewUsers(String adminId){
        for(User user : users.values()){
            if(adminId.equalsIgnoreCase(user.getUserId())){
                continue;
            }
            System.out.println("User: " + user);
        }
    }

    public void viewAccounts(){
        for(Account account : accounts.values()){
            System.out.println("Account: " + account);
        }
    }

    public void viewUsersAccounts(){
        for(Account account : userAccounts.values()){
            System.out.println("Account: " + account);
        }
    }
}