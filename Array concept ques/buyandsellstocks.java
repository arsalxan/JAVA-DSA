public class buyandsellstocks {
    public static int buysell(int arr[]){
        int maxprofit=0,buyprice=arr[0],profit=0;
        for(int i=1;i<arr.length;i++){
            if(buyprice<arr[i]){
               profit=arr[i]-buyprice;
               
            }
            else{
                buyprice=arr[i];
            }
            maxprofit=Math.max(maxprofit,profit);
            
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={22,2,5,7,6,4};
        System.out.println(buysell(arr));
    }
}
 