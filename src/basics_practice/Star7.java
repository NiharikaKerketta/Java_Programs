package basics_practice;

public class Star7 {

	public static void main(String[] args) {
		int count=1;
		for(int rows=1;rows<=5;rows++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(count++ + " ");
			}
				System.out.println();
		}
	}
}