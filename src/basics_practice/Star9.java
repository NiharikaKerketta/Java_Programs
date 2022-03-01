package basics_practice;

public class Star9 {

	public static void main(String[] args) {
		int count=1;
		int n=5;
		for(int rows=1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(count++ + " ");
			}

			if(rows<=n/2)
			{
				count=count+5;
			}
				System.out.println();
		}
	}
}

