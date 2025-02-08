import java.util.*;
public class operatrors {
    public static void main(String srg[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Enter Number 1: ");
        a=sc.nextInt();
        System.out.print("Enter Number 2: ");
        b=sc.nextInt();
        System.out.println("Enter 1,2,3 or 4 for Addition,Subtraction,Multiplication and Devision respectively: ");
        int c= sc.nextInt();
        do{
       switch (c) {
            case 1: 
            System.out.println("Sum of "+a+" and "+b+ " is: "+(a+b));
                break;
            case 2:
            System.out.println("Difference of "+a+" and "+b+ " is: "+(a-b));
            break;
            case 3:
            System.out.println("Product of "+a+" and "+b+ " is: "+(a*b));break;
            case 4:
            System.out.println("Product of "+a+" and "+b+ " is: "+(a/b));break;
            default:System.out.println("Invalid entry");
                break;
        } }while(c!=0);
    }
    
}
