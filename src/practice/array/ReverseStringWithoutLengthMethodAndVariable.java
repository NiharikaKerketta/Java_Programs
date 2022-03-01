package practice.array;

public class ReverseStringWithoutLengthMethodAndVariable {

	public static void main(String[] args) {
		String s = "Niharika";
		char[] sToArray = s.toCharArray();
		int count =0;
		for(char ch : sToArray)
		{
			count++;
		}
			System.out.println("Length of the given string="+count);
			
		for(int i =count-1; i>=0 ; i--) 
		{
			System.out.print(sToArray[i]+"");
		}

	}

}
