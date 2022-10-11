package com.libatique;

public class BankAccount {
    private double balance;
    private String accountNumber, name, email, phoneNumber;

    public BankAccount(String accountNumber,double balance, String name, String email, String phoneNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // This constructor is called when no arguments are passed on object instantiation...
    public BankAccount() {
        this("999999", 0.00, "Default Account Name", "Default Email", "Default Phone Number");
        System.out.println("No arguments passed. Initializing using default values.");
    }

    public void depositFunds (double depositAmount) {
        System.out.println("Current balance after transaction is: " + (this.balance += depositAmount));
        this.balance += depositAmount;
    }

    public void withdrawFunds (double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient balance for transaction. Withdrawal not processed.");
            return;
        }
        System.out.println("Current balance after transaction is: " + (this.balance -= withdrawAmount));
        this.balance -= withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
