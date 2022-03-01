package basics_practice;

public class Star5 {

	public static void main(String[] args) {
		for(int rows=1;rows<=9;rows++)
		{
			for(int col=1;col<=9;col++)
			{
				if(rows==1 || rows==9 || rows==5 || col==1 || col==5 || col==9 || rows==col || rows+col==10)
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

