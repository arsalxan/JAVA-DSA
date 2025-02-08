public class stringcompression {
    public static StringBuilder compress(StringBuilder str){
        int count=1;
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(i!=str.length()-1 &&str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i));
                if(count>1){ sb.append(count);}
                count=1;
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        StringBuilder name= new StringBuilder("abcddd"),str=new StringBuilder();
        str=compress(name);
        System.out.println(str);
    }
}
