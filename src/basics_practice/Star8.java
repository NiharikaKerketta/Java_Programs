package basics_practice;

public class Star8 {

	public static void main(String[] args) {
		int n=15;
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				if(rows==1 || rows==n || col==1 || col==n || rows==col || rows+col==n+1 || rows==(n/2)+1 || col==(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}