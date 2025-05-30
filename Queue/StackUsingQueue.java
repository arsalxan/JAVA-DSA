import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static class Stack {
        public Queue<Integer> q1;
        public Queue<Integer> q2;

        Stack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (q1.isEmpty()) {
                q2.add(data);
                return;
            }
            q1.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int result = -1;
            if (q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    result = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(result);
                }
                return result;
            }
            while (!q1.isEmpty()) {
                result = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(result);
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int result = -1;
            if (q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    result = q2.remove();
                    q1.add(result);
                }
                return result;
            }
            while (!q1.isEmpty()) {
                result = q1.remove();
                q2.add(result);
            }
            return result;

        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
