package fintech.model;

/**
 * @author 12S23025-Alif Aflah Suedi
 * @author 12S23039-Prisca R. Manurung
 */

public class Account {
    private final String owner;
    private final String accountName;
    private final double balance;

    // Existing constructor
    public Account(String owner, String accountName, double balance) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = balance;
    }

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
}