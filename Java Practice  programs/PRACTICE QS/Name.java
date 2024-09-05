import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numOfNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numOfNames];

        System.out.println("Enter the Names:");
        for (int i = 0; i < numOfNames; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        for (String name : names) {
            System.out.println(name+"\tHello Welcome to My World");
        }

        scanner.close();
    }
}
