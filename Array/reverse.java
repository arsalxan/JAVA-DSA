public class reverse {
    public static void rev(int arr[]){
        int end=arr.length-1,temp;
        for(int i=0;i<end;i++){
            temp=arr[i]; arr[i]=arr[end];arr[end]=temp;end--;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4};
        rev(arr);
        printarr(arr);

    }
}
