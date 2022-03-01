package basics_practice;

public class Star2 {

	public static void main(String[] args) {
		int n=5;
		int even=1;
		int odd=0;
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;rows>=col;col++)
			{
				int count= rows+col; 
				if(count%2==0)
				{
				System.out.print(even + " ");
				}
				else
				{
				System.out.print(odd + " ");
				}
			}
		System.out.println();
		}
	}
}