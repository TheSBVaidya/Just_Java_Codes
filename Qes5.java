// 5.Write a java program to find the index of a substring.

import java.util.Scanner;

public class Qes5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Enter the String to know the index: ");
        String find = sc.nextLine();

        char[] charArray = new char[str.length()];
        char[] findCharArray = new char[find.length()];


    //    System.out.println(str.length());

        for (int i=0; i<=str.length(); i++) {
            charArray[i] = str.charAt(i);
            findCharArray[i] = find.charAt(i);
            if (charArray[i] == findCharArray[i]) {
                System.out.println(find.length());
            } else {

            }
        }
    }
}
