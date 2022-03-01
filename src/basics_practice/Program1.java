package basics_practice;

public class Program1
{
	public static void main(String[] args) 
	{
		for(int rows=1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				if(rows==1 || rows==5 || rows==3 || col==1 || col==3 || col==5)
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

