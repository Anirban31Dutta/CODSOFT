import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to chosen a number between 1 to 100.");

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congrates! Your guess is right in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts == 10) {
            System.out.println("Sorry, you are run-out of attempts. The number was " + secretNumber + ".");
        }

        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.next();

        if (response.equalsIgnoreCase("yes")) {
            play_round(scanner);
        } else {
            System.out.println("Thanks for playing!");
        }
    }

    private static void play_round(Scanner scanner) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congrates! Your guess is right in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts == 10) {
            System.out.println("Sorry, you are run-out of attempts. The number was " + secretNumber + ".");
        }

        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.next();

        if (response.equalsIgnoreCase("yes")) {
            play_round(scanner);
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}