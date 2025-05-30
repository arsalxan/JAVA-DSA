import java.util.Stack;
public class ReverseAStack {
    public static void pushOnBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int temp=st.pop();
        pushOnBottom(st, data);
        st.push(temp);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        reverse(st);
        pushOnBottom(st, temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
         System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
