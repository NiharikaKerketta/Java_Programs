package practice.array;

public class ReverseStringUsingReverse {

	public static void main(String[] args) {
		//Type2
		String s1 = "Niharika";
		String reverse = "";
		for(int i =s1.length()-1; i>=0; i--) 
		{
			reverse = reverse + s1.charAt(i);
			//System.out.println(reverse);
		}
			System.out.print(reverse);

	}

}
