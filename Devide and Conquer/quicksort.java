public class quicksort {
    public static int part(int arr[], int st, int end) {
        int pivot = arr[end], i;
        i = st - 1;
        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int arr[], int st, int end) {
        if (st < end) {
            int pivot = part(arr, st, end);
            quickSort(arr, st, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 1, 3, 5, 9, 0, -6, 90 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
