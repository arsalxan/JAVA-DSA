import java.util.*;
public class loop{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        boolean z=true;
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){ z=false; break;}
        }
        if(z){
            System.out.println(n+ " is a Prime NUmber");
        }
        else {
            System.out.println(n+ " is Not a Prime number");
        }
    }
}
