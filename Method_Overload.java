
class calc {
	
	public int add (int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int add (int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	
	public double add (double a, double b, double c) {
		double result = a + b + c;
		return result;
	}
		
}
public class Method_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj = new calc();
		
		int result1 = obj.add(5, 5);
		int result2 = obj.add(2, 5, 5);
		double result3 = obj.add(2, 5, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
