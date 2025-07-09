public class QuickSort {
    public static void Quick(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int st=low; int end=high;
        int pivot=arr[end];
        
        while(st<=end){
            while(arr[st]<pivot){ st++;}
            while(arr[end]>pivot){end--;}

            if(st<=end){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;end--;
            }
        }
       
        Quick(arr, low, end);
        Quick(arr, st, high);
    }
    public static void main(String[] args){
        int arr[]={2,1,3,5,4};
        Quick(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}