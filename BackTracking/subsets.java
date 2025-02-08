public class subsets {
    public static void stringSubsets(String str,StringBuilder sb,int i){
        if(i==str.length()){
            if(sb.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(sb);
            }
            return;
        }
        stringSubsets(str, sb.append(str.charAt(i)),i+1);
        sb.deleteCharAt(sb.length()-1);
        stringSubsets(str, sb,i+1);
    }
    public static void main(String [] a){
        stringSubsets("abc",new StringBuilder(""), 0);
    }
}
