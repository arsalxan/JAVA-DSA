import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,2};
        int nextGreater[]= new int[arr.length];
        Stack<Integer> stack= new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[stack.peek()];
            }
            stack.push(i);
        }
        for(int a:nextGreater){
            System.out.print(a+" ");
        }
    }
}