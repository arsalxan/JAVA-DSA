public class bubblesort {
    
    public static void bubble(int arr[]){
        boolean swapped=true; int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swapped=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp;
                }
            }
            if(swapped){
                break;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,6,5};
        bubble(arr);
        printarr(arr);
    }
}