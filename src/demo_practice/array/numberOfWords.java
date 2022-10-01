package demo_practice.array;

import java.util.LinkedHashSet;

public class numberOfWords {

	public static void main(String[] args) {
		
		String s = "hello world hello all welcome to ty";
		//String[] sArray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		int count =0;
		for (int i = 0; i < s. length() - 1; i++) {
			if ((s. charAt(i) == ' ') && (s. charAt(i + 1) != ' ')) {
			count++; }
			} System. out. println("Number of words in a string : " + count);
		}
	}


