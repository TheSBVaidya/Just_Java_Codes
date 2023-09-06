import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6}; // WE USE THIS INITIALIZATION OF ARRAY IF WE KNOW THE INPUT
		
		int arr1[] = new int[6]; // WE USE THIS INITIALIZATION OF ARRAY IF WE DONT KNOW THE INPUT
		
		arr1[0] = 7;
		arr1[1] = 8;
		arr1[2] = 9;
		arr1[3] = 10;
		arr1[4] = 11;
		arr1[5] = 12;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
