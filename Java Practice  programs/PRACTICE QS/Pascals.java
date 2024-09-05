import java.util.Scanner;
public class Pascals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("Please enter a positive integer.");
        } 
        else {
            for (int i=0;i<n; i++) {
                int num = 1;
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
