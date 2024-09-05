import java.util.Random;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true) {
            int num1 = random.nextInt(10) +1;
            int num2 = random.nextInt(10) +1;
            int correctAnswer = num1 * num2;
            System.out.println("What is " + num1 + " * " + num2 + "?");
            System.out.print("Enter your answer (or 0 to exit): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == 0) {
                break;
            }
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!!!");
            } else {
                System.out.println("Incorrect!!!. The correct answer is " + correctAnswer + ".");
            }
        }

        System.out.println("Thank you for practicing multiplication!!!");
        scanner.close();
    }
}
