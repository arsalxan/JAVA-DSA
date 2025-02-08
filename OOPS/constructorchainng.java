public class constructorchainng {
    public static void main(String[] args) {
        Calc c1= new Calc(15,5);
        c1.diff().mul().sum();
    }
}
class Calc{
    int a; int b;
    public Calc(int a, int b){
        this.a=a; this.b=b;
    }
    public Calc sum(){
        System.out.println("SUM= "+(a+b));
        return this;
    }
    public Calc diff(){
        System.out.println("Diff= "+(a-b));
        return this;
    }
    public Calc mul(){
        System.out.println("mul= "+(a*b));
        return this;
    }
}
