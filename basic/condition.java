import java.util.*;
public class condition {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 no");
        int a= sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        }
    }

