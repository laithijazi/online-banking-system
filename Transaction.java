import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Transaction{
    private String type;
    private double amount;
    private LocalDateTime date;
    private String accountNumber;

    public Transaction(String type, double amount, String accountNumber) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.accountNumber = accountNumber;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "type: " + type + ", amount: " + amount + ", date: " + date;
    }

    public void logTransaction(){
        try{
            FileWriter writer = new FileWriter("transactions_" + getAccountNumber() + ".txt", true);
            writer.write(toString() + "\n");
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error in writing transaction to file: " + e.getMessage());
        }
    }
}
