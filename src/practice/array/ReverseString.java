package practice.array;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Niharika";
		for(int i =s.length()-1; i>=0; i--) 
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
			
		//Type2
			String s1 = "Niharika";
			String reverse = "";
			for(int i =s1.length()-1; i>=0; i--) 
			{
				reverse = reverse + s1.charAt(i);
				System.out.println(reverse);
			}
				System.out.print(reverse);
		}

	}


