import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int mark = scanner.nextInt();
        if(mark >= 90 && mark < 100)
        {
            System.out.println("Grade: A");
        }
        else if(mark >= 70 && mark < 90)
        {
            System.out.println("Grade: B");
        }
        else if(mark >= 55 && mark < 70)
        {
            System.out.println("Grade: C");
        }
        else if(mark <= 40 && mark < 50)
        {
            System.out.println("Grade: Fail");
        }
        else if(mark > 100)
        {
            System.out.println("ENter valid mark : ");
        }
}
}
