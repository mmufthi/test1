package com.company;

public class Customer {
    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Customer(){
        this.name = "John Doe";
        this.balance = 50;
        this.accNumber = 123456789;
        this.email = "John@email.com";
        this.phone = "(202) - 8986754";
    }

    public Customer(int accNumber, double balance, String name, String email, String phone) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    protected void deposit(double amount){
        this.balance += amount;
    }

    protected void withdraw(double amount){
        if(this.balance >= amount) {
            this.balance = this.balance - amount;
        }else
            System.out.println("Operation cancelled, balance is less than withdraw amount");
    }

    protected void print(){
        System.out.println("Customer name: " + name);
        System.out.println("Customer account number: " + accNumber);
        System.out.println("Customer balance: " + balance);
        System.out.println("Customer email: " + email);
        System.out.println("Customer phone: " + phone);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


}
