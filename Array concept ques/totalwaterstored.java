public class totalwaterstored {
    public static int waterstored(int arr[]){
        if(arr.length<3){
            return 0;
        }
        int sum=0, size=arr.length;
        int leftmax[]=new int[size], rightmax[]= new int[size];
        leftmax[0]=arr[0];
        for(int i=1;i<size;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        rightmax[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }
        for(int i=0;i<size;i++){
            sum+=(Math.min(leftmax[i],rightmax[i]))-arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(waterstored(arr));
        
    }
}