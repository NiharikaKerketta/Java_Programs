package demo_practice.array;


public class SwappingWithout3rdVariable {

	public static void main(String[] args) {
		String s1 = "Niharika";
		String s2 = "Kerketta";
		
		System.out.println("String before swapping "+s1+" "+s2);
		
		s1= s1+s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1+" "+s2);

	}

}
