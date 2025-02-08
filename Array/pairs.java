public class pairs {
    public static void pair(int arr[]){
         int COUNT=0;
        for(int i=0;i<arr.length-1;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.err.print("(" + curr +","+ arr[j]+") ");
                COUNT++;
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        pair(arr);
        // total pairs=[n(n-1)/2]
    }
}
