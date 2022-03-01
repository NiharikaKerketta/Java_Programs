package practice.array;

public class PrintStringSequentially {

	public static void main(String[] args) {
		String s1 = "Niharika";
		String reverse = "";
		for(int i =0; i<s1.length(); i++) 
		{
			reverse = reverse + s1.charAt(i);
			System.out.println(reverse);
		}
	}
}
