public class binarysearch {
    public static int find (int arr[], int key){
        int start=0, mid, end=arr.length-1;
        for(int i=0;i<end;i++){
            mid=(start+end)/2;
            if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                return mid;
            } 
           
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int y=find(arr,4);
        System.out.println(y);
        }
    
}
