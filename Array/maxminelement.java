import java.util.*;
public class maxminelement {
    public static int min(int arr[]){
        int max= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int max(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,1,5};
        System.out.println("min element "+min(arr));
        System.out.println("max element " +max(arr));
        
    }
}
