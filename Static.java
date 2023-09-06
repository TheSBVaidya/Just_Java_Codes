class Demo {

    static int a;
    static int b;

    int m;
    int n;

    static 
    {
        a = 10;
        b = 20;
    }

    {
        m = 30;
        n = 40;
    }

    static void display() {
        System.out.println("The Static variable a: "+a);
        System.out.println("The Static variable b: "+b);
    }

    void display1() {
        System.out.println("The non-Static variable m: "+m);
        System.out.println("The non-Static variable n: "+n);
    }
}   


public class Static {
    public static void main(String[] args) {
        Demo d = new Demo();

        Demo.display(); // Without creating object we can call Static block
        d.display1();
    }   
    
}
