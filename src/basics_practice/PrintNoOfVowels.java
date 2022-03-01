package basics_practice;

public class PrintNoOfVowels {

	public static void main(String[] args) {
		String s = "india";
		//String s = s1.toString();
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
				}
			}
		System.out.print(count);
	}
}
