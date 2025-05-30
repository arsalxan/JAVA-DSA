import java.util.ArrayList;
public class StackusingArrayList {
    private ArrayList<Integer> stack;

    public StackusingArrayList() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);

    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    public static void main(String[] args) {
        StackusingArrayList stack = new StackusingArrayList();
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