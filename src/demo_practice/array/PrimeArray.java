package demo_practice.array;

public class PrimeArray {

	public static void main(String[] args) {
		 int[] a = { 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < a.length; i++) {
			int n = 2;

			while (n <= a[i])
			{
				if (a[i] % n == 0)
				{
					break;
				}
				n++;
			}
			if (n == a[i])
			{
				System.out.print(a[i] + " ");
			}

		}

	}
	}


