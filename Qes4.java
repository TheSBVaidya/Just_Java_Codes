// 4.Write a java program to remove a particular character from a String.

import java.util.Scanner;

public class Qes4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Enter the removable charecter: ");
        char ch = sc.next().charAt(0);

        char[] charArray = new char[str.length()];
        
        System.out.println("Before Removing Character: \n"+str);
        System.out.println("\nAfter Removing Character:");

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
            if (charArray[i] != ch) {
                // System.out.println("Character is removed");
                System.out.print(charArray[i]);
            } else {
                //System.out.println("Character is not Found");
            }
        }

    }    
}
