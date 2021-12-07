package com.Rafiullah;

public class Account {
    private String number;
    private double balance;
    private String customerNumber;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty Constructor called");
    }
    public Account(String number, double balance,String customerNumber,String customerEmailAddress,String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerNumber = customerNumber;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposite "+ depositAmount + "made. New balance is "+ this.balance);
    }
    public void withdraw(double withrowAmount){
        if(balance - withrowAmount <0){
            System.out.println("Only " +this.balance +"available. withdrwal not processed. ");
        }else {
            System.out.println("Withdrawal of " + withrowAmount + " processed. Remaining balance = "+this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
