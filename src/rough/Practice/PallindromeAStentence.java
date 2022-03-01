package rough.Practice;

public class PallindromeAStentence {

	public static void main(String[] args) {
		String s= "Radar";
		for(int i=s.length()-1;i>=0;i++) {
			char s1 = s.charAt(i);
		}
		if(s.toLowerCase().equals(s.toLowerCase())) {
			System.out.println("is pallindrome");
		}
		else {
			System.out.print("not a pallindrome");
		}

	}

}
