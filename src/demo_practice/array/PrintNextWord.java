package demo_practice.array;

import java.util.LinkedHashSet;

public class PrintNextWord {

	public static void main(String[] args) {
		String s = "niharika kerketta";
		String[] arr = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<arr.length-1;i++) {
			if(s.charAt(i) == 0) {
			System.out.println(s);
		}
		}
	}

}
