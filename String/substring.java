public class substring {
    public static String sub(String str,int s, int e){
        String s1="";
        for(int i=s;i<e;i++){
            s1+=str.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        // String name="Arsalan",str,str1;
        // str=sub(name, 2, 5);
        // str1=name.substring(0,5);
        // System.out.println(str);
        // System.out.println(str1);
        System.out.println("a".compareToIgnoreCase("A"));
    }
}
 