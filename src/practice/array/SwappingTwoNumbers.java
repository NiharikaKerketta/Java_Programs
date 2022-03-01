package practice.array;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		//not supposed to use other variable
		
		int a=10;
		int b=20; //a=20 b=10
		 a=a+b;   //a=30 b=20
		 b=a-b;   //30-20=10  a=30 b=10
		 a=a-b;   //30-10=20  a=20 b=10
		 System.out.println(a +","+ b);

	}

}
