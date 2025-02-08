public class binarystring {
    public static void printbinary(int n,int last, String str){
        if(n==0){
            System.out.println(str);return;
        }
        printbinary(n-1,0,str+"0");
        if(last==0){
            printbinary(n-1,1,str+"1");
        }
    }
    public static void main(String [] args){
        printbinary(4,0,"");
    }
}
