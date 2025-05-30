import java.util.*;
public class ValidParanthesis {

    public  static boolean isValid(String str){
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(i);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.isEmpty()){
                    return false; // No matching opening bracket
                }
                char top = str.charAt(st.peek());
                if((ch==')' && top=='(') || 
                   (ch=='}' && top=='{') || 
                   (ch==']' && top=='[')){
                    st.pop(); // Valid pair found
                } else {
                    return false; // Mismatched brackets
                }
            }
        }
        // If stack is empty, all brackets were matched
        return true;
    }
    public static void main(String[] args) {
        String s = "({[]})()"; // Example of valid input
        String st = "({[})"; // Example of invalid input  
        System.out.println(isValid(s));
        System.out.println(isValid(st));
    }
}