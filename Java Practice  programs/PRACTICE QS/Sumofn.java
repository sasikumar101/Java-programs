import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the natural number:");
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
                sum=sum+i;
        
            }
            System.out.println("sum of first\t"+num+"\tnatural numbers:"+sum);

        
        scanner.close();
    }
}
