import java.util.*;
public class palindrome {
    public static boolean ispal(String str){
        int st=0, end=str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
                return false;
            }
            st++; end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String name;
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine();
        if(ispal(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}