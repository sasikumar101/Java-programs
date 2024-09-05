import java.util.Scanner;

public class PassorFail{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int a = scanner.nextInt();
        if(a >= 60 && a < 100) 
        {
            System.out.println("PASS");
        } 
        else if(a >= 45 && a < 50 ) 
        {
            System.out.println("FAIL");
        } 
        else if(a >= 50 && a < 60) 
        {
            System.out.println("PASS");
        } 
        else if(a < 50) 
        {
            System.out.println("FAIL");
        }
        else if(a >100)
        {
            System.out.println("Enter mark bewtween 100.");
        }
    }
}
