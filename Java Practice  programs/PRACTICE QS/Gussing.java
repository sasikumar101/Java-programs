import java.util.Random;
import java.util.Scanner;
public class Gussing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        }

        scanner.close();
    }
}
