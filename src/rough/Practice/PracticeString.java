package rough.Practice;

public class PracticeString {

	public static void main(String[] args) {
		String s = "12345fdhjdf89";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='0' || s.charAt(i)<='9') {
				int num =s.charAt(i)-48;
				if(num%2!=0) {
					System.out.println(s.charAt(i));
				}
			}
		}
	}

}
