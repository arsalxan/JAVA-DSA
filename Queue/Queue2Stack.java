import java.util.Stack;

public class Queue2Stack {
    public static class Queue{
        public Stack<Integer> s1;
        public Stack<Integer> s2;

        Queue(){
            s1= new Stack<>();
            s2= new Stack<>();
        }
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            //[1,2,3]
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //[data]
            s1.push(data);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            //[1,2,3,data]
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Nothing to remove");
                return -1;
            }
            return s1.pop();
        }
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Nothing to remove");
                return -1;
            }
            return s1.peek();
        }
    
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
