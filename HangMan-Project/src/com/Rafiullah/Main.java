package com.Rafiullah;
import java.util.Scanner;

class Main {
    private static String[] secretWords;
    static {
        System.out.println("HANGMAN");
        secretWords = new String[]{"Apple", "Banana", "Cat", "Dog", "Elephant", "Flower", "Girl", "Jump", "Hello", "India", "Karin",
                "Lion", "Mango", "Nancy", "Objects", "Pick", "Queen", "Rafiullah", "Service", "Telephone", "Umbrella", "Yellow", "Zebra"};
    }

    private static String word = secretWords[(int) (Math.random() * secretWords.length)];
    private static String star;

    static {
        star = new String(new char[word.length()]).replace("", "*");
    }

    private static int numberOfTry = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            if (numberOfTry >= 6 || !star.contains("*")) break;
            System.out.println("Guess a letters");
            System.out.println(star);
            String guess = input.next();
            hangman(guess);

        }
        input.close();
    }

    public static void hangman(String guess) {
        String newasterisk;
        newasterisk = "";
        for (var i = 0; i < word.length(); i++)
            if (word.charAt(i) == guess.charAt(0)) newasterisk += guess.charAt(0);
            else if (star.charAt(i) != '*') newasterisk += word.charAt(i);
            else newasterisk += "*";

        if (star.equals(newasterisk)) {
            numberOfTry++;
            hangmanDrawing();
        } else {
            star = newasterisk;
        }
        if (star.equals(word)) {
            System.out.println("Yes! The secret word is " + word +"!" + " You have won");
        }
    }

    public static void hangmanDrawing() {
        if(numberOfTry == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(numberOfTry == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(numberOfTry == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(numberOfTry == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(numberOfTry == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(numberOfTry == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else{
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("GAME OVER! The word was " + word);
        }
        while (word.equals("Y") || word.equals("y"));
    }
}
