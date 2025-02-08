public class subarray {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.err.print(" (");
                for(int k=i; k<=j;k++){
                    System.err.print(arr[k]+" ");
                }System.err.print(")");
            }System.err.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr);
        }
}
≤˛