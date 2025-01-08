import java.time.LocalDateTime;

public class Transaction{
    private String type;
    private double amount;
    private LocalDateTime date;
    private Account account;

    public Transaction(String type, double amount, Account account) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String toString(){
        return "type: " + type + ", amount: " + amount + ", date: " + date;
    }
}
