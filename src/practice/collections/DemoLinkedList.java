package practice.collections;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(30);
		list.add(null);
		list.add(30);
		list.add("tia");
		list.add(60.2);
		list.add(80);
		list.add(null);
		list.add(500);
		System.out.println(list);
	}

}
