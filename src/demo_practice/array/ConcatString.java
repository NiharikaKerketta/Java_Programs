package demo_practice.array;

public class ConcatString {

	public static void main(String[] args) {
		String s = "xyz" + "abc";
		
		for(int i=0;i<s.length()/2;i++) {
			System.out.println(s.charAt(i)+""+s.charAt(s.length()/2+i));
		}
	}

}
