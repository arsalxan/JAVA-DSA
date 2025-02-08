public class findocc {
    public static int occ(int arr[], int key,int i){
        if(i>=0){
            if(arr[i]==key){ return i+1;}
            else{
                return occ(arr,key,i-1);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int []arr={10,2,3,4,15,1};
        System.out.println(occ(arr,1,arr.length-1));

    }
}
