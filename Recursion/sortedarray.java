public class sortedarray {
    public static int checksort(int arr[],int i){
        if(i<arr.length-1){
        if(arr[i]<=arr[i+1]){
            return checksort(arr,(i+1));
        }
        else{
            return 1;
        }
        
    }
    return 0;
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,3};
    if(checksort(arr, 0)==0){
        System.out.println("Sorted");
    }
    else{
        System.out.println(" NOt Sorted");
    }
}
}
