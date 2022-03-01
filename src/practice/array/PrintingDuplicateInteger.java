package practice.array;

import java.util.LinkedHashSet;

public class PrintingDuplicateInteger {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,1};
		
		//create a set
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		//add all the elements of an array to set
		for(int i=0;i< arr.length;i++)
		{
			set.add(arr[i]);
		}							//{1,2,3,4}
		
		//compare the element of set with the element of an array
		for(Integer n :set)
		{
			int count =0;
			for(int i=0;i<arr.length;i++)
			{
				if(n == arr[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(n);
			}
		}
	}

}
