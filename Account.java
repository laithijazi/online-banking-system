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
            Transaction transaction = new Transaction("Desposit", depositAmount, getAccountNumber());
            transaction.logTransaction();
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

    public void transfer(bankSystem bank, double transferAmount, String senderAccountNumber, String recepientAccountNumber){
        Account recepientAccount = bank.getAccounts().get(recepientAccountNumber);
        Account senderAccount = bank.getAccounts().get(senderAccountNumber);
        if(recepientAccount == null){
            System.out.println("Recepient account not found");
        }
        else if(transferAmount <= 0){
            System.out.println("Transfer amount must be positive");
        }
        
        else if(transferAmount > senderAccount.getBalance()){
            System.out.println("Insufficient balance.");
        }
        else{
            recepientAccount.setBalance(recepientAccount.getBalance() + transferAmount);
            senderAccount.setBalance(senderAccount.getBalance() - transferAmount);
            System.out.println(transferAmount + " has been transferred from you account successfully");
        }
    }
}