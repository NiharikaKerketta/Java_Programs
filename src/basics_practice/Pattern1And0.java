package basics_practice;

public class Pattern1And0 {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		int temp=3;
		for(int rows=1;rows<=n;rows++)
		{
			for (int col=1;rows>=col ;col++ )
			{
			System.out.print(count-- + " ");
			}
		count=count+temp;
		temp=temp+2;
		System.out.println();
		}
	}
}
