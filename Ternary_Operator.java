import java.util.Scanner;

public class Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter number");
		int a = scanner.nextInt();
		
		System.out.println("Enter number");
		int b = scanner.nextInt();
		
		System.out.println("Enter number");
		int c = scanner.nextInt();
		
		int res = (a<b)? (a<c? a: c): (b<c? b: c);
		System.out.println(res);
		
		if (a<b) {
			if (a<c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if (b<c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		 
	}

}
