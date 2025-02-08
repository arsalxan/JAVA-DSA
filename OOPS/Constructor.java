public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student();
    }
}
class Student{
    private int id;
    private String name;
    
    Student(){
        System.out.println("Constructor is called\n");
    }
}
