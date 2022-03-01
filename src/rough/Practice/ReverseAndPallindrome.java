package rough.Practice;

public class ReverseAndPallindrome {

	public static void main(String[] args) {
		String s= "Radar";
		String reverse = "";
		for(int i=s.length()-1; i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		if(s.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("is pallindrome");
		}
		else {
			System.out.print("not a pallindrome");
		}
		
	}

}
