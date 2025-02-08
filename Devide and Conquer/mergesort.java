public class mergesort {
    public static void merge(int arr[], int st, int m, int en) {
        int temp[] = new int[en - st + 1];
        int i, j, k;
        i = st;
        j = m + 1;
        k = 0;
        while (i <= m && j <= en) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i < m + 1) {
            temp[k++] = arr[i++];
        }
        while (j <= en) {
            temp[k++] = arr[j++];
        }
        for (i = st, k = 0; k < temp.length; k++) {
            arr[st++] = temp[k];
        }

    }

    public static void mergeSort(int arr[], int st, int end) {

        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, st, mid, end);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 1, 3, 5 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}