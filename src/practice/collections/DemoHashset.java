package practice.collections;

import java.util.HashSet;

public class DemoHashset {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(50);
		set.add(null);
		set.add(500);
		set.add("jia");
		set.add(20);
		set.add(10.23);
		System.out.println(set);
	}

}
