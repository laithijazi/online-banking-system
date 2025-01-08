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
}
