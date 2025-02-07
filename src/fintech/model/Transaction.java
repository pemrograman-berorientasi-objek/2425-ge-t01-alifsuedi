package fintech.model;

/**
 * @author 12S23025-Alif Aflah Suedi
 * @author 12S23039-Prisca R. Manurung
 */

 public class Transaction {
     private static int idCounter = 0;
     private final int id;
     private final String accountName;
     private final double amount;
     private final String postedAt;
     private final String note;
 
     public Transaction(String accountName, double amount, String postedAt, String note) {
         this.id = ++idCounter;
         this.accountName = accountName;
         this.amount = amount;
         this.postedAt = postedAt;
         this.note = note;
     }
 
     public int getId() {
         return id;
     }
 
     public String getAccountName() {
         return accountName;
     }
 
     public double getAmount() {
         return amount;
     }
 
     public String getPostedAt() {
         return postedAt;
     }
 
     public String getNote() {
         return note;
     }
 
     @Override
     public String toString() {
         return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note;
     }
 }