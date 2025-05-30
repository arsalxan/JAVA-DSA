import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class MaximumSubarray {
    public static void maxOfKSub(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Record max for the current window
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        maxOfKSub(arr, k);
    }
}
