import java.util.*;
public class prefixsubsum{
public static void print(int arr[]){
    int maxsum=Integer.MIN_VALUE, prefix[]=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+ arr[i];
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int currsum= i==0?prefix[j]: prefix[j]-prefix[i-1];
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
    }
    System.out.println(maxsum);
}
public static void main(String[] args) {
    int arr[]={1,2,-3,4};
    print(arr);

}
}