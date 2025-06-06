package yash;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionID, accountID;
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(int transactionID, int accountID, String type, double amount) {
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public int getAccountID() { return accountID; }
    public String getType() { return type; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID + ", Type: " + type + 
               ", Amount: " + amount + ", Timestamp: " + timestamp;
    }
}
