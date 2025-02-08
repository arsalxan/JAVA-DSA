public class printnoindec {
    public static void print(int n){
        if(n>=1){
        System.out.print(n+" ");
        print(n-1);
        }
    }
  public static void main(String[] args) {
    print(10);
  }
}
