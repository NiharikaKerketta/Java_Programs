package practice.collections;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet<>();
		set.add(20);
		set.add(90);
		set.add(10);
		set.add(500);
		set.add(50);
		set.add(10);
		System.out.println(set);
	}

}
