package practice.array;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String s = "hello world to hello all welcome to ty";
		String[] sArray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(String word1 : sArray) {
			set.add(word1);
		}
		
		for(String word2 : set) {
			System.out.print(word2+" ");
		}
	}

}
