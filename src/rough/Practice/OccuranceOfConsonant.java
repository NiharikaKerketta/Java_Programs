package rough.Practice;

public class OccuranceOfConsonant {

	public static void main(String[] args) {
		String s = "java selenium";
		char[] s1 = s.toCharArray();
		int size = s1.length;
		int vovCount = 0;
		int conCount = 0;
		int speCount = 0;
		int i = 0;
		while(i != size) 
		{
			if(s1[i]>='a' && s1[i]<='z') 
			{
				if(s1[i]=='a' || s1[i]=='e' || s1[i]=='i' || s1[i]=='o' || s1[i]=='u') 
				{
					vovCount++;
				}
				else 
				{
					conCount++;
				}
			}
			else
			{
				speCount++;
			}
			i++;
		}
			System.out.println("vovwel ="+vovCount);
			System.out.println("consonant ="+conCount);
			System.out.println("special ="+speCount);
	}

}
