public class permutation {
    public static void findPer(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String str1=str.substring(0,i)+str.substring(i+1);
            findPer(str1, ans+curr);
        }
    }
    public static void main(String [] a){
        findPer("abcd", "");
    }
}
