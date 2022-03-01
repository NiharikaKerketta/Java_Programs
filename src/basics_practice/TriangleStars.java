package basics_practice;

public class TriangleStars {

	public static void main(String[] args) {
		int n = 5;
		for(int row = 1;row <=n;row++) {
			for(int col =1;row>=col;col++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();

		int n1 = 5;
		for(int row = 1;row <=n1;row++) {
			for(int col =1;row+col<=n+1;col++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();

		int n2 = 5;
		for(int row = 1;row <=n2;row++) {
			for(int col =1;col<=n2;col++) {
				if(row + col >=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
		
		System.out.println();
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row<=col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
