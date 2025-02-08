public class assignment2 {
    public static void numtostring(int n,StringBuilder sb){
        String str[]={"zero ","one ","two ","three ","four ","five ","six ","seven"," eight","nine"};
       
        if(n>0){
            int last=n%10;
            numtostring(n/10,sb);
            sb.append(str[last]);
        }
        
        System.out.println(sb);
    }
    public static void main(String[] args) {
        numtostring(1203,new StringBuilder(""));
    }
}
