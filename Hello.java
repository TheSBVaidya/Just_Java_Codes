class staticKeyword {

    static int age;

    static {
        System.out.println("This is Static Block");
        age = 22;
    }

    static void display() {
        System.out.println(age);
    }
}
public class Hello {
   public static void main(String[] args) {
    System.out.println("This is main method");
    staticKeyword.display();
    }
}