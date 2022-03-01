package practice.array;

import java.util.LinkedHashSet;

public class OccuranceOfWord {

	public static void main(String[] args) {
		String s = "hello world hello all welcome to ty";
		String[] sArray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(String word1 : sArray)
		{
			set.add(word1);
		}
		
		for(String word2 : set)
		{
			int count =0;
			for(String word3 : sArray)
			{
				if(word2.equals(word3))
				{
					count++;
				}
			}
			System.out.println(word2 + " : "+ count);
		}
	}
}
