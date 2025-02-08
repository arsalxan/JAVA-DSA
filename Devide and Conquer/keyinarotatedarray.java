public class keyinarotatedarray {
    public static int findkey(int arr[], int key, int i, int j) {
        if (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[i] <= arr[mid]) {
                if (arr[i] <= key && key <= arr[mid]) {
                    return findkey(arr, key, i, mid - 1);
                } else {
                    return findkey(arr, key, mid + 1, j);
                }
            } else {

                if (arr[mid] < key && key <= arr[j]) {
                    return findkey(arr, key, mid + 1, j);

                } else {
                    return findkey(arr, key, i, mid - 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 1, 2, 3, 4 };
        System.out.print(findkey(arr, 4, 0, arr.length - 1));

    }
}
