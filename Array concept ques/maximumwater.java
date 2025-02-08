public class maximumwater {
    public static int maxwater(int arr[]){
        int start=0,end=arr.length-1, maxwater=Integer.MIN_VALUE, water=0;
        while(start<end){
            water=(end-start)*(Math.min(arr[start++],arr[end--]));
            maxwater=Math.max(water,maxwater);
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,3,5,6,7};
        System.out.println(maxwater(arr));
    }
}
