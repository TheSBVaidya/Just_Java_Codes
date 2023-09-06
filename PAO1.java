class instance {

    static int sum = 0;

    instance() {
        sum = sum + 1;
    }

    public static int getinstance() {
        return sum;
    }
}
public class PAO1 {
    public static void main(String[] args) {
            instance obj = new instance();
            instance obj1 = new instance();

            System.out.println(instance.getinstance());
    }       
}