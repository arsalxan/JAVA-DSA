public class countingsort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,6,5};
        countSort(arr);
        printarr(arr);
    }
}
