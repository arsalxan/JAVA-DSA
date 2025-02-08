public class assigment1 {
    public static void countoccurance(int arr[],int i,int key){
        if(i<arr.length){
            if(arr[i]==key){
                System.out.print(i+" ");
            }
            countoccurance(arr, i+1, key);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4,32,45,2,3,2};
        countoccurance(arr, 0, 2);

    }
}
