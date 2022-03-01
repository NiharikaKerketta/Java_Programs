package basics_practice;

public class Star6 {

	public static void main(String[] args) {
		int n=7;
		for(int rows=1;rows<=n;rows++)
		{
			int count =rows+64;
			int temp=n-1;
			for(int col=1;rows>=col;col++)
			{
				System.out.print((char)count +" ");
				count=count+temp--;
			}

		System.out.println();
		}
	}
}