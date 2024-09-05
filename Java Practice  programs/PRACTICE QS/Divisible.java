import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int d = scanner.nextInt();
        if (n > 0 && d > 0) {
            int firstDivisible = (d <= n) ? d : 0;
            if (firstDivisible != 0) {
                System.out.println("The first number divisible by " + d + " is " + firstDivisible);
            } else {
                System.out.println("No numbers in the range 1 to " + n + " are divisible by " + d);
            }
        } else {
            System.out.println("Please enter positive integers for both upper limit and divisor.");
        }

        scanner.close();
    }
}
