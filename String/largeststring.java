public class largeststring {
    public static void largest(String arr[]){
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] arg){
        String fruits[]={"apple","mango","banana"};
        largest(fruits);
    }
}
