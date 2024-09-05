import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
    }
}
