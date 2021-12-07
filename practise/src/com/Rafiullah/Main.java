package com.Rafiullah;

public class Main {
    public static void main (String[]args) {
        Account rafiAccount = new Account("1234",10.0,"Rafi Rahmati","Rafi_Rahmati@hotmail.com","209-4962187");
        System.out.println(rafiAccount.getBalance());
        System.out.println(rafiAccount.getCustomerEmailAddress());
        rafiAccount.withdraw(100.00);
        rafiAccount.deposit(50.00);
        rafiAccount.withdraw(100.00);
        rafiAccount.deposit(51.00);
        rafiAccount.withdraw(100.00);
//        Car toyota = new Car();
//        Car Honda = new Car();
//        Car ford = new Car();
//        toyota.setModel("Corolla");
//        System.out.println("Car Model is: " + toyota.getModel());
//        toyota.setName("Toyota");
//        System.out.println("Compnay of the car is: "+toyota.getName());
//        toyota.setWheels(4);
//        System.out.println("This car has " +toyota.getWheels() +" wheels");
//        Honda.setWheels(4);
//        System.out.println(Honda.getWheels());
//        Honda.setModel("Accord");
//        System.out.println(Honda.getModel());
//        Honda.setName("Honda");
//        System.out.println(Honda.getName());
//        ford.setName("ford");
//        System.out.println(ford.getName());
//
//        }
    }
    }
