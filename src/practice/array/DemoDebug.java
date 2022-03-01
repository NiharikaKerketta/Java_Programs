package practice.array;

import java.util.Iterator;

public class DemoDebug {
	String rev = "";
	public static void main(String[] args) {
		System.out.println("start");
		DemoDebug obj = new DemoDebug();
		String out = obj.rev("niharika");
		
		System.out.println(out);
		System.out.println("end");
		
	}
	public String rev(String s) {
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev = rev+s.charAt(i);
		}
		return rev;
	}

}
