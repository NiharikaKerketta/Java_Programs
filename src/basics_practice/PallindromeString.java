package basics_practice;

public class PallindromeString {

	public static void main(String[] args) {
		String s="Radar";
		String reverse = "";
		//int sLength = s.length();
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		if(s.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not pallindrome");
		}
	}

}
