import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        int range = 100, score = 0;
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(range) + 1;
            int attempts = 0, userGuess;
            System.out.println("Guess the number between 1 and " + range + ".");

            while (attempts < maxAttempts) {
                System.out.print("what was your  guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed it in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println(" sorry! Too high!");
                } else {
                    System.out.println(" sorry! Too low!");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry! The number was " + numberToGuess + ".");
                }
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Your score: " + score);
        scanner.close();
    }
}
