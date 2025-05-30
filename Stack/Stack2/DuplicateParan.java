import java.util.Stack;

public class DuplicateParan {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // we know that string has an opening bracket so we check for the closing one

            if (ch == ')') {
                int count = 0;
                // we check for the starting bracket 
                while (s.pop() != '(') {
                    //till then we remove elements from stack
                    //increase the count
                    count++;
                }
                if (count < 1) {
                    // if there is no between content return no duplicate
                    return true;
                }
                
            } else {
                //pushing the element in stack
                s.push(ch);
            }
        }
        // no duplicate found return false
        return false;
    }

    public static void main(String[] args) {
        String s1 = "((a+b))"; // Example of duplicate parentheses
        String s2 = "(a+b)"; // Example of no duplicate parentheses
        System.out.println(isDuplicate(s1)); // Should return true
        System.out.println(isDuplicate(s2)); // Should return false
    }

}
