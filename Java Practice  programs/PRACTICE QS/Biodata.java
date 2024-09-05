import java.util.Scanner;
public class Biodata{
    public static void main(String[ ] args){
        Scanner scanner=new Scanner(System.in);
        String name,address,dob,father,mother;
        int age;
        System.out.println("Enter the Name:");
        name=scanner.nextLine();
        System.out.println("Date of Birth:");
        dob=scanner.nextLine();
        System.out.println("Age:");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Father's name:");
        father=scanner.nextLine();
        System.out.println("Mother's name:");
        mother=scanner.nextLine();
        System.out.println("Address:");
        address=scanner.nextLine();
        System.out.println("Student Bio data:");
        System.out.println("Name: "+name);
        System.out.println("Date of Birth:"+dob);
        System.out.println("Age:"+age);
        System.out.println("Father's Name:"+father);
        System.out.println("Mother's Name:"+mother);
        System.out.println("Address:"+address);
        scanner.close();
    }
}