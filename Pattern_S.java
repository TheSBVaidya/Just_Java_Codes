
public class Pattern_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 7;
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				if (i==0 && j>0 || i==(n-1)/2 && j>0 && j<(m-1) || j==m-1 && i>(n-1)/2 && i<n-1 || i==(n-1) && j<(m-1) || j==0 && i>0 && i<(n-1)/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
