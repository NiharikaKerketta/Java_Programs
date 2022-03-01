package practice.array;

public class Segregate {

	public static void main(String[] args) {
		String s = "ab12@x3";
		String alpha = "";
		String num = "";
		String special = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha = alpha + s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num + s.charAt(i);
			}
			else 
			{
				special = special + s.charAt(i);
			}
		}
		System.out.println("The given string is="+s);
		System.out.println("Alphabets are="+alpha+","+" Num are="+num+","+"special are="+special);

	}

}
