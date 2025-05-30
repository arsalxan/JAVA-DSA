public class GreaterReactangle {
    // brute force
    public static void burte(int arr[]) {
        int maxarea = Integer.MIN_VALUE, area = 0;
        for (int i = 0; i < arr.length - 1; i++) {// do not check the last element
            int width = 1;// for a new height the width is 1
            int j = i + 1;// start comparing from the next element
            int m=i-1;
            // check while the end of array or the condition is not fullfilled
            while (i < arr.length - 1 && j < arr.length && arr[i] <= arr[j]) {
                width++;// increase the width
                j++;// increment the j index for next comparison
            }
            while (i < arr.length - 1 && m>=0 && arr[i] <= arr[m]) {
                width++;// increase the width
                m--;// increment the j index for next comparison
            }
            area = width * arr[i];// calculate area
            maxarea = Math.max(area, maxarea);// compare with the maxarea till now

        }
        System.out.println(maxarea);
    }

    // optimal solution with order of n O(n)
    public static void optimal(int arr[]) {
        int maxarea = 0;
        int widthRight[] = new int[arr.length];
        int widthLeft[] = new int[arr.length];
        widthLeft[0]=1;
        widthRight[arr.length - 1] = 1;
        for (int i = widthRight.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                widthRight[i] = widthRight[i + 1] + 1;
            } else {
                widthRight[i] = 1;
            }
        }
        for (int i = 1; i <widthLeft.length; i++) {
            if (arr[i] < arr[i - 1]) {
                widthLeft[i] = widthLeft[i -1] + 1;
            } else {
                widthLeft[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int width=widthLeft[i]+widthRight[i]-1;
            maxarea = Math.max(maxarea, width * arr[i]);
        }
        System.out.println(maxarea);
    }

    public static void main(String[] args) {

        int arr[] = { 2,1,2};
        burte(arr);
        // optimal(arr);

    }
}
