// ARRAYS -AssignmentQuestion 1:Given an integer array nums,
// return true if any value appears at least twice in the array, and return false if every element is distinct
import java.util.Arrays;
public class twiceesortedlement {
    public static boolean iftwice( int arr[]){
        boolean result=false;
        int element=arr[0];
        for(int i=1;i<arr.length;i++){
            if(element==arr[i]){
                result=true;
            }
            else{
                element=arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,3,4,5};
        Arrays.sort(arr);
        System.out.println(iftwice(arr));
        }
}
