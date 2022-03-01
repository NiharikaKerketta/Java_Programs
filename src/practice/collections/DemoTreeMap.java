package practice.collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap map = new TreeMap<>();
		map.put(5, "ashu");
		map.put(10, "rishi");
		map.put(10, "ansh");
		map.put(7, "dolly");
		map.put(15, null);
		map.put(50, "nia");
		System.out.println(map);
	}

}
