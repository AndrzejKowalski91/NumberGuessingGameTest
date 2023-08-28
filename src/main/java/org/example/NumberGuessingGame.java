import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        int targetNumber = r.nextInt(1000);
        int numberOfAttempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 0 and 999. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < targetNumber) {
                System.out.println("Your guess is too small.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too large.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + numberOfAttempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
