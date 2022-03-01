package basics_practice;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "niharika";
		 //with length()
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		//without length()
		String s1= "niharika";
		char[] stoArr = s.toCharArray();
		for(int i= stoArr.length-1;i>=0;i--) {
			System.out.print(stoArr[i]);
		}
		
	}

}
