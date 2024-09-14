package org.example.demo1;

class BankAccount {
 private double balance;
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
         return true;
     } else {
         System.out.println("Insufficient funds for withdrawal.");
         return false;
     }
 }

 public double getBalance() {
     return balance;
 }

 public String getAccountDetails() {
     return "Balance: $" + balance;
 }
}

class SavingsAccount extends BankAccount {
 private static final double WITHDRAWAL_LIMIT = 1000; 

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 public boolean withdraw(double amount, boolean isSavingsAccount) {
     if (isSavingsAccount) {
         if (amount > WITHDRAWAL_LIMIT) {
             System.out.println("Withdrawal amount exceeds the limit of $" + WITHDRAWAL_LIMIT);
             return false;
         }
     }
     return super.withdraw(amount);
 }

 @Override
 public String getAccountDetails() {
     return "Savings Account - " + super.getAccountDetails() + " | Withdrawal Limit: $" + WITHDRAWAL_LIMIT;
 }
}

public class BankAccountDemo {
 public static void main(String[] args) {
     BankAccount b = new BankAccount(5000);
     System.out.println("Bank Account Details:");
     System.out.println(b.getAccountDetails());

     b.deposit(200);
     b.withdraw(1000);
     b.withdraw(5000); 

     System.out.println("Updated Bank Account Details:");
     System.out.println(b.getAccountDetails());

     SavingsAccount sa= new SavingsAccount(3000);
     System.out.println("Savings Account Details:");
     System.out.println(sa.getAccountDetails());

     sa.deposit(500);
     sa.withdraw(1500, true); 
     sa.withdraw(500, true); 

     System.out.println("Updated Savings Account Details:");
     System.out.println(sa.getAccountDetails());
 }
}
