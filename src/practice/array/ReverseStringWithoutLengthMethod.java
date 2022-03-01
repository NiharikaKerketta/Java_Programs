package practice.array;

public class ReverseStringWithoutLengthMethod {

	public static void main(String[] args) {
		String s = "Niharika";
		char[] sToArray = s.toCharArray();
		for(int i = sToArray.length-1; i>=0; i--)
		{
			System.out.print(sToArray[i]);
		}

	}

}
