
import java.util.Random;
import java.util.Scanner;

    public class GuessingGame {
        public static void main(String[] args) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int maxAttempts = 10;
            int attempts = 0;
            boolean CorrectlyGuessed = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            // Main game loop
            while (attempts < maxAttempts && !CorrectlyGuessed) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    CorrectlyGuessed = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (CorrectlyGuessed) {
                System.out.println("Congratulations! You guessed the correct number " + numberToGuess + " in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry! You've used all your attempts. The correct number was " + numberToGuess + ".");
            }

            sc.close();
        }
    }