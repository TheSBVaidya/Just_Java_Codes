class printUsingStatic {

    static void printStatic() {
        System.out.println("This is message is print without creating a object of a class");
    }
}
public class PAQ4 {
    public static void main(String[] args) {
        
        printUsingStatic.printStatic();
    }
}
