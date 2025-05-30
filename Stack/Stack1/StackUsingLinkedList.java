public class StackUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        private Node head;

        public Stack() {
            this.head = null;
        }

        public void push(int value) {
            if(isEmpty()) {
                head = new Node(value);
                return;
            }
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
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
