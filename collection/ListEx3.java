package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListEx3 {
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Spring");
		
		names.add("java");
		
		names.add("Html");
		
		names.add("css");
		
		names.add("bootstrap");
		
		System.out.println(names);
		
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			
			String name = itr.next();
			
			System.out.println(name);
		}
		
		
		
		
		
	}

}
