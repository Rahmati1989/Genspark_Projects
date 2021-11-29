package com.Rafiullah;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static boolean failer = false;
    public static void main(String[] args) {
//        try {
            String choice = "";
            System.out.println("Hello! What is your name?");
            String name = scan.nextLine();
            do {
                failer = false;
                try {
                System.out.println("Hello," + name + ", I am thinking of a number between 1 and 20");
                int number = 1 + (int) (20 * Math.random());
                int guess = -1;
                int count = 0;
// this is just

                    int i;
                   int trail = 6;
                   for(i=0;i<trail;i++){
                       count++;
                       System.out.println("Take a guess.");
                       guess = scan.nextInt();
                       verifyInput(guess,scan);

                    if (number == guess) {
                        System.out.println("Good job, " + name + "! you guessed my number in " + count + " gueses!");
                    } else if (number < guess) {
                        System.out.println("Your guess is too high");
                    } else {
                        System.out.println("Your guess is too low");
                    }

                    }
                   if(i == trail){
                       System.out.println("You Attempt number of trails, You lose.");
                   }

                System.out.println("Would you like to play again?(y or n)");
                choice = scan.next();

        }catch (Exception e){
                    failer = true;
                            scan.nextLine();
            System.out.println("Input Must be a number and It should be in range of 1 to 20");

        }
            }
            while (choice.equals("Y") || choice.equals("y")|| failer);

    }
    public static void verifyInput(int guess, Scanner scan){
        while (guess <1 || guess >20){
            System.out.println("You should chose the number in the range of 1 to 20");
            guess = scan.nextInt();
        }
    }
}
