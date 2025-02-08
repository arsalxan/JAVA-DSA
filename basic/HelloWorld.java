import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        int d=(a+b+c)/3;
        System.out.println("Average of these three no:");
        System.out.println(d);
    }
}