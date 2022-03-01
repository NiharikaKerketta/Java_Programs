package basics_practice;

public class Pattern12 {

	public static void main(String[] args) {
		int n=4;
		int count =1;
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;rows>=col;col++)
			{
				System.out.print(count++ + " ");
			}
				System.out.println();
		}

		System.out.println();
		int count2=1;
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; rows+col<=n+1; col++)
			{
				System.out.print(count2++ + " ");
			}
		System.out.println();
		}
	
		System.out.println();
		int count3=1;
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=n; col++)
			{
				if(rows<=col)
				{
				
				System.out.print(count3++ +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		
		System.out.println();
		}

		System.out.println();
		int count4=1;
		for(int rows=1; rows<=n; rows++)
		{
			for(int col=1; col<=n; col++)
			{
				if(col+rows>=n+1)
				{
				
				System.out.print(count4++ +" ");
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
