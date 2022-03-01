package practice.array;

import java.util.LinkedHashSet;

public class GetDuplicateWords {

	public static void main(String[] args) {
		String s = "hello to world hello all welcome to ty";
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
