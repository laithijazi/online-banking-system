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

    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= 0){
            System.out.println("Withdraw amount must be positive");
        }
        else if(withdrawAmount > balance){
            System.out.println("Insufficient balance.");
        }
        else{
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + " has been withdrawn from your account successfully!");
            System.out.println("Your new balance is " + balance);
        }
    }

    public void transfer(bankSystem bank, double transferAmount, String recepientAccountNumber){
        if(transferAmount <= 0){
            System.out.println("Transfer amount must be positive");
        }
        Account recepientAccount = bank.getAccounts().get(recepientAccountNumber);
        if(recepientAccount == null){
            System.out.println("Recepient account not found");
        }
        recepientAccount.setBalance(recepientAccount.getBalance() + transferAmount);
        System.out.println("Transferred successfully!");
    }
}