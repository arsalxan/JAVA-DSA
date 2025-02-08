public class multipleinhertitance {
    public static void main(String[] args) {
        C c1= new C();
        c1.display();c1.show();
    }
}
interface A{
    void display();
}
interface B{
    void show();
}
class C implements A, B{
    public void display(){
        System.out.println("Method of A");
    }
    public void show(){
        System.out.println("Method of B");
    }
}
