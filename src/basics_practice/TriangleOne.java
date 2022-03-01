package basics_practice;

public class TriangleOne {

	public static void main(String[] args) {
		int n = 5;
		int count =1;
		for(int row = 1;row <=n;row++) {
			for(int col =1;row>=col;col++) {
			System.out.print(count+" ");
			}
			System.out.println();
		}

	}

}
