abstra class human { // This is super or parent class
    int age;
    private String name; // privete members not inheritaned in different class

    abstract human() {
        System.out.println("we make human class constructor to check wheter its print or not");
        // this will print beacuse beacuse of in student class there is default class which have super keyword in there thats why its inclue this method
    }
    void sleep() {
        age = 20;
        System.out.println("HAHAHAHAHAHAHA");
        System.out.println(age);
    }
}

class Student extends human { // this is child class or derived class

    void display() {
        System.out.println("the age is : "+age);
    }

}

public class Inharitance {
    public static void main(String[] args) {
        Student st = new Student();
        
        st.sleep();
        st.display();
    }
}
