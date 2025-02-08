public class kadyne {
    public static void print(int arr[]){
        int max=Integer.MIN_VALUE,currsum=0;
        for(int i=0;i<arr.length;i++){
          currsum+=arr[i];
          if(currsum<0){ currsum=0;}
          if(currsum>max){ max=currsum;}
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,5};
        print(arr);
    }
}
