
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Post Incrementation
		System.out.println("Post Incrementation: ");
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		// Pre Incrementation
		System.out.println("Pre Incrementation: ");
		int c = 5;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
//		int e = 5;
//		int f = e++ + ++e + --e;
//		System.out.println(e);
//		System.out.println(f);
		
		// Post Decrementation
		System.out.println("Post Decrementaion: ");
		int e = 5;
		int f = e--;
		System.out.println(e);
		System.out.println(f);
		
		// Pre Decrementaion
		System.out.println("Pre Decrementaion: ");
		int g = 5;
		int h = --g;
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Assignment operators
		System.out.println("Assignment Operators: ");
		
		System.out.println("Compount Assignment: ");
		int num1 = 10;
	
		System.out.println("Using (+=) Operator");
		System.out.println(num1 += 5);
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Relational Operators
		System.out.println("Relational Operator: ");
		
		int num2 = 10;
		int num3 = 20;
		
		System.out.println("(num2 == num3):");
		System.out.println(num1 == num2);
		System.out.println("(num2 != num3):");
		System.out.println(num1 != num2);
		System.out.println("(num2 > num3):");
		System.out.println(num1 > num2);
		
		System.out.println("(num2 < num3):");
		System.out.println(num1 < num2);
		
		System.out.println("(num2 >= num3):");
		System.out.println(num1 >= num2);
		
		System.out.println("(num2 <= num3):");
		System.out.println(num1 <= num2);
	
		System.out.println("(num3 == num2):");
		System.out.println(num1 == num2);
		
		System.out.println("(num3 != num2):");
		System.out.println(num1 != num2);
		
		System.out.println("(num3 > num2):");
		System.out.println(num1 > num2);
		
		System.out.println("(num3 < num2):");
		System.out.println(num1 < num2);
		
		System.out.println("(num3 >= num2):");
		System.out.println(num1 >= num2);
		
		System.out.println("(num3 <= num2):");
		System.out.println(num1 <= num2);
		//System.out.print("Hello");
	}

}