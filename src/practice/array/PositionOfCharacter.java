package practice.array;

import java.util.LinkedHashSet;

public class PositionOfCharacter {

	public static void main(String[] args) {
		String s1 = "TEster";
		String s = s1.toLowerCase();
		System.out.println(s);
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch : set)
		{
			//int count =0;
			for(int i = 0; i<s.length();i++) 
			{
				if(ch == s.charAt(i))
				{
				//count++;
					System.out.println("The position of character "+ch+" is "+(i+1));
					break;
				}
			}		
		}
	}
}


