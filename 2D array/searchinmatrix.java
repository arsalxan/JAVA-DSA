public class searchinmatrix {
    public static boolean searchmatrix(int arr[][], int key){
        int row=arr.length-1, col=0;
        while(col<arr[0].length && row>=0){
            if(arr[row][col]==key){
                System.out.println("Key found at ("+ row+" , "+ col+ " )");
                return true;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
        };
       searchmatrix(arr,8);
    }
}
