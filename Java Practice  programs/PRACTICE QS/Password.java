import java.util.Scanner;

public class Password{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "sasikumar p";

        while (true) {
            System.out.print("Enter password: ");
            if (scanner.nextLine().equals(correctPassword)) {
                System.out.println("Password correct!!!");
                break;
            }
            System.out.println("Incorrect password!!!. Try again.");
        }

        scanner.close();
    }
}
