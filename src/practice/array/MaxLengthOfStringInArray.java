package practice.array;

public class MaxLengthOfStringInArray {

	public static void main(String[] args) {
		String[] str = {"niharika", "manasa", "kavya", "spoorthy"};
		String maxElement = str[0];
		//for(int i=1;i<str.length;i++) {
			//if(maxElement.length()<str[i].length()) {
				//maxElement = str[i];
			//}
		//}
		//System.out.println(maxElement);
		for(int i=0;i<str.length;i++) {
			if(maxElement.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}

	}

}
