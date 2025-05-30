import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        String str="abcd",rev="";
        Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch= st.pop();
            rev+=ch;
        }
        System.out.println(rev);
    }
}
