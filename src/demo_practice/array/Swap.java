package demo_practice.array;

public class Swap {

	public static void main(String[] args) {
		String a="mansas";
		String b="salian";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a:"+a +" b:" + b);
		
		

	}

}
