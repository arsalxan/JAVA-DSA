import java.util.Stack;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // Output: 30
        System.out.println("Stack size is: " + stack.size()); // Output: 3          
        System.out.println("Popped element is: " + stack.pop()); // Output: 30
        System.out.println("Stack size after pop is: " + stack.size()); // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        stack.pop(); // Remove 20
        stack.pop(); // Remove 10
        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); // Output: true
    }
}
