public class suminrow {
    public static int sum(int arr[][],int row){
        int sum=0;
        if(row>=arr.length){ System.out.println("Invalid");
         return 404;}
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[row][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        };
        System.out.println(sum(arr, 3));
    }
}
