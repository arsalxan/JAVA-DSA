import java.util.Stack;
public class LongestRectangle {
    public static int largestRectangleArea(int[] arr) {
        int maxarea = 0;
        int[] NSL = new int[arr.length];
        int[] NSR = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Nearest Smaller to Left
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            NSL[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Nearest Smaller to Right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            NSR[i] = (stack.isEmpty()) ? arr.length : stack.peek();
            stack.push(i);
        }

        // Compute max area
        for (int i = 0; i < arr.length; i++) {
            int width = NSR[i] - NSL[i] - 1;
            int area = arr[i] * width;
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={0,9};
        System.out.println(largestRectangleArea(arr));
    }
}
