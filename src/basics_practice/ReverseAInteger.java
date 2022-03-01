package basics_practice;

public class ReverseAInteger {

	public static void main(String[] args) {
		int n = 5432;
		int rem;
		int rev=0;
		while(n!=0) {
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println(rev);

	}

}
