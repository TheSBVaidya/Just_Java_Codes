public class Array_2D {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[3][2];
		
		arr[0][0] = 5;
		arr[0][1] = 4;
		arr[1][0] = 3;
		arr[1][1] = 2;
		arr[2][0] = 1;
		arr[2][1] = 6;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// JAGGED ARRAY
		int arr1[][] = {
							{1,2,3,4,5,6} , 
							{7,8,9} , 
							{10,11,12,13,14,15,16,17,18,19,20}
					   };
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
