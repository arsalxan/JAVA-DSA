public class insertion {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current= arr[i], prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];prev--;
            }
            arr[prev+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,6,5};
        insertion(arr);
        printarr(arr);
    }
}
