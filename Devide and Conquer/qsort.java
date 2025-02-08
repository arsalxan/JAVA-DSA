public class qsort {
    public static int part(int arr[], int st, int end) {
        int pivot = arr[st];
        int i = st, j = end;

        while (i < j) {
            do {
                i++;
            } while (i < end && arr[i] <= pivot);

            do {
                j--;
            } while (j > st && arr[j] > pivot);

            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with arr[j]
        int temp = arr[st];
        arr[st] = arr[j];
        arr[j] = temp;

        return j; // Return the final position of the pivot
    }

    public static void quickSort(int arr[], int st, int end) {
        if (st < end) {
            int pivot = part(arr, st, end);
            quickSort(arr, st, pivot);      // Sort left part
            quickSort(arr, pivot + 1, end); // Sort right part
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 9, 1, 3, 5,9};
        quickSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
