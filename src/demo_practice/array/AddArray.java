package demo_practice.array;

public class AddArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		int count =0;
		for(int i=0;i<arr.length;i++) 
		{
			int b[]=arr[i];
			if(i==0)
				count=b.length-1;
			for(int j=0;j<arr.length;j++)
			{
				
				if(j==count)
				{
					sum = sum +b[j];
					count--;
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
