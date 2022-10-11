package com.libatique;

public class VIPCustomer {
    private String name, emailAddress;
    private double creditLimit;

    public VIPCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 70000.00;
    }

    public VIPCustomer() {
        this("Default Name", "Default email address", 70000.00);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
