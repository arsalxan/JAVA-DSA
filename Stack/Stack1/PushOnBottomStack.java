import java.util.Stack;
public class PushOnBottomStack {
    public static void pushOnBottom(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int temp=st.pop();
        pushOnBottom(st, data);
        st.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack before pushing on bottom: " + stack);
        
        pushOnBottom(stack, 5);
        
        System.out.println("Stack after pushing 5 on bottom: " + stack);
        System.out.println(stack.peek());
    }
    
}
