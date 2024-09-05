public class swapi{
    public static void main(String args[]){
        int a=10,b=20;
        System.out.println("Before swapping: A="+a+"\tB="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: A="+a+"\tB="+b);
    }
}