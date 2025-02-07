package fintech.model;

public class Account {
    private final String owner;
    private final String accountName;
    private final double balance;

    // New constructor
    public Account(String command, String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0; // Default balance
    }

    @Override
    public String toString() {
        return owner + "|" + accountName + "|" + balance;
    }

    // Getters and other methods...
}