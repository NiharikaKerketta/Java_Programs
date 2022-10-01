package demo_practice.array;

import java.util.LinkedHashSet;

public class aabbb {

	public static void main(String[] args) {
		String s = "aabbbcccc";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch : set)
		{
			int count =0;
			for(int i = 0; i<s.length();i++) {
				if(ch == s.charAt(i)) {
					count++;
				}
				else {
					
				}
				
			}
			System.out.print(ch+""+count);
		}
	}

}