import java.util.Scanner;
// 1.Write a java program to Reverse a string without using the inbuilt method.

public class Qes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String str = sc.nextLine();

        for (int i = 0; i<str.length(); i++) {
            System.out.println(i);
        }
    }
}
