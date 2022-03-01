package practice.array;

public class ReversingStringInArray {

	public static void main(String[] args) {
		String str = "Welcome to my India";
		String[] strArray = str.split(" ");
		
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]+" ");
		}
	}
}
