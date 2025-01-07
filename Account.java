public class Account{
    private String accountNumber;
    private String userId;
    private double balance;

    public Account(String accountNumber, String userId, double initialBalance){
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount <= 0){
            System.out.println("Deposit amount must be positive.");
        }
        else{
            balance += depositAmount;
            System.out.println(depositAmount + " has been deposited to your account successfully!");
            System.out.println("Your new balance is " + balance);
        }
    }
}