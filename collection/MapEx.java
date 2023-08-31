package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(100, "java");

		tm.put(101, "css");

		tm.put(102, "html");

		tm.put(103, "bootstrap");

		tm.put(104, "angular");

		System.out.println(tm);
		
		Set<Integer> set = tm.keySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int keys = (Integer) itr.next();
			
			System.out.println(keys +"=" + tm.get(keys));
			
		}
		
		

	}

}
