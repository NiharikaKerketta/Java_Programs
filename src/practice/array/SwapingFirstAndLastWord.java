package practice.array;

public class SwapingFirstAndLastWord {

	public static void main(String[] args) {
		String s = "Welcome to my India";
		String[] str = s.split(" ");
		{
			String temp = str[0];
			str[0] = str[str.length-1];
			str[str.length-1] = temp;
			
			for(String s1 : str) {
				System.out.print(s1+ " ");
			}
		}
	} 
}
