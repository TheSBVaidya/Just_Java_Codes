import java.util.Scanner;

class Student {
    private int age;
    private String name;
    private double totalMarks;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        System.out.println("Enter the Student Name:");
        obj.setName(sc.nextLine());

        System.out.println("Enter the Student Age:");
        obj.setAge(sc.nextInt());

        
        System.out.println("Enter the Student total marks:");
        obj.setTotalMarks(sc.nextFloat());

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getTotalMarks());

    }
}