package game;


import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;// Math.random always gives value 0.0 to 0.99
        int guess = 0;
        int attempts = 0;
        int maxTries = 7;

        System.out.println("Guess a number between 1 and 100!");

        while (attempts < maxTries && guess != secret) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }
        }

        if (guess == secret) {
            System.out.println("Correct! You got it in " + attempts + " tries!");
        } else {
            System.out.println("Out of tries! The number was " + secret + ".");
        }
    }
}

