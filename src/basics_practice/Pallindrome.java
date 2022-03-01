package basics_practice;

public class Pallindrome {

	public static void main(String[] args) {
		String s = "abcdcba";
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("Not pallindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Is pallindrome");

	}

}
