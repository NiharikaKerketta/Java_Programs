package basics_practice;

public class Strar3 {

	public static void main(String[] args) {
		int n=7;
		for(int rows=1;rows<=n;rows++)
		{
			int count =rows;
			int temp=n-1;
			for(int col=1;rows>=col;col++)
			{
				System.out.print(count +" ");
				count=count+temp--;
			}

		System.out.println();
		}
	}
}