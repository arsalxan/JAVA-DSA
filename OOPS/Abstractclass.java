// Abstract class cannot be initiated they are used for idea purpose
public class Abstractclass {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();h1.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animals eats well");
    }
    abstract void walk();
}
class Horse extends Animal{
void walk(){
    System.out.println("It runs");
}
}