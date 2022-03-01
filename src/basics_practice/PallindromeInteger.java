package basics_practice;

public class PallindromeInteger {

	public static void main(String[] args) {
		int num=35653;
		int reverse =0;
		int rem;
		int originalNum = num;
		while(num!=0) {
			rem = num%10;
			reverse = reverse*10 + rem;
			num /=10;
		}
		if(originalNum == reverse) {
			System.out.println("Num is pallindrome");
		}
		else {
			System.out.println("Num is not pallindrome");
		}
	}

}
