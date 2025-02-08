public class ClassandObjects {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.name="Arsalan";
        p1.getData();
        p1.setname("Aman");
        p1.getData();
    }
}
class Pen{
    String name;
    void setname(String name){
        this.name=name;
    }
    void getData(){
        System.out.println(this.name);
    }
}