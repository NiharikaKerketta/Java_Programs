package practice.array;

import java.util.LinkedHashSet;

public class PositionOfNextCharacter {

	public static void main(String[] args) {
		String s1 = "TEster";
		String s = s1.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch : set)
		{
			
			for(int i = s.length()-1; i>0; i--) 
			{
				if(ch == s.charAt(i))
				{
					System.out.println("The position of next character "+ch+" is "+(i+1));
					break;
				}
			}		
		}

	}

}
