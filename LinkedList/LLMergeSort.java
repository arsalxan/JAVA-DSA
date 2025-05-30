import java.util.*;

public class LLMergeSort {

    // Merge two sorted LinkedLists
    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peekFirst() <= right.peekFirst()) {
                result.add(left.pollFirst());
            } else {
                result.add(right.pollFirst());
            }
        }

        result.addAll(left);
        result.addAll(right);

        return result;
    }

    // Merge sort function
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(4, 2, 1, 5, 3));

        System.out.println("Original List: " + list);

        LinkedList<Integer> sortedList = mergeSort(list);

        System.out.println("Sorted List: " + sortedList);
    }
}
