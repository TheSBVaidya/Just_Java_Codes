class Student {

    private int age;
    private String name;
    static int marks;

    static {
        marks = 34;
    }
    public Student() {
        System.out.println("This is a Default Constructoer");
        age = 20;
        name = "Sanjay";
    }

    public Student(int age) {
        //System.out.println("This only accept int");
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println(age);
        System.out.println(name);
    }

    static int getMarks() {
        return marks;
    }
}

public class Constructoer {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        
        Student obj1 = new Student(22);
        obj1.display(); 

        Student obj2 = new Student(25, "SANJAY BABAN VAIDYA");
        obj2.display();

        System.out.println("Static Variable: "+Student.getMarks());

    }
}