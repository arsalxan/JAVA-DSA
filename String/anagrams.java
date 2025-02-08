// same letters in different order like bat and tab
import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        String s1="raee";
        String s2="care";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ss1=s1.toCharArray(), ss2=s2.toCharArray();
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        boolean result=Arrays.equals(ss1,ss2);
        if(result){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
