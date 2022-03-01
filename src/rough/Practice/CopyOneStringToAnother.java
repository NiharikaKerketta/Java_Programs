package rough.Practice;

public class CopyOneStringToAnother {

	public static void main(String[] args) {
		String s = "niharika";
		char ch[] = s.toCharArray();
		int size = ch.length;
		char a[]= new char[size];
		int i = 0;
		while(i != size) 
		{
			a[i] = ch[i];
			++i;
		}
		System.out.println(ch + " " + a);
	}

}
