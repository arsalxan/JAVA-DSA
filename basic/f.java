public class f{
    public static void main(String[] args){
        int arr[]={-1,2,3,4,-1},cs=0, ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){ cs=0;}
            if(cs>ms){ ms=cs;}
        }
        System.out.println(ms);
    }
}