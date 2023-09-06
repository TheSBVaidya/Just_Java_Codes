class cal {
	
	public int add(int[] nums) {
		
		int sum = 0;
		
		for (int a:nums) {
			sum = sum + a;
		}
		
		return sum;
	}
}
public class Anonymous_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cal obj = new cal();
		
		int result = obj.add(new int[] {1,2,3,4} );
		
		System.out.println(result);
		

	}

}
