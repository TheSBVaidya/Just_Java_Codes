import java.util.Scanner;

class addition {
    Scanner sc = new Scanner(System.in);
    
    int a;
    int b;
    int sum = 0;

    public void input() {
        System.out.println("Enter the first value");
        a = sc.nextInt();
        System.out.println("Enter the second value");
        b = sc.nextInt();
    }

    public void compute() {
        sum = a + b;
    }

    public int result() {
        return sum;
    }
}

class subtaction extends addition {

    public void compute() {
        sum = a - b;
    }

    public int result() {
        return sum;
    }

    public void display() {
        System.out.println("Substraction is: "+sum);
    }
}

class multiplication extends addition {

    public void compute() {
        sum = a * b;
    }

    public int result() {
        return sum;
    }
}

class division extends addition {

    public void compute() {
        sum = a / b;
    }

    public int result() {
        return sum; 
    }
}
public class methodsInInheritance {
    public static void main(String[] args) {
        addition a = new addition();
        subtaction s = new subtaction();
        multiplication m = new multiplication();
        division d = new division();

        // a.input();
        // a.compute();
        // System.out.println(a.result());

        s.input();
        s.compute();
        s.display();

        // m.input();
        // m.compute();
        // System.out.println(m.result());

        // d.input();
        // d.compute();
        // System.out.println(d.result());
    }
}
