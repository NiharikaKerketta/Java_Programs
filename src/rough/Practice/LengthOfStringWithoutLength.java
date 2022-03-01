package rough.Practice;

public class LengthOfStringWithoutLength {

	public static void main(String[] args) {
		String s = "my name";
		s = s.concat("\0");
		char[] ch = s.toCharArray();
		int count =0;
		int i =0;
		
		while(ch[i] != '\0') 
		{
			count++;
			i++;
		}
		System.out.println(count);

	}

}
