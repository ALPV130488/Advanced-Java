package collection;

import java.util.Comparator;
import java.util.TreeSet;
//alphabetical order

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts= new TreeSet<String>(new MyOrder());
		
		ts.add("spring");

		ts.add("java");

		ts.add("html");

		ts.add("css");

		ts.add("bootstrap");

		System.out.println(ts);
		
		
	}

}

//ob1-obj2(a-b) = -ve(-ve)=+ve
//
//obj2- obj1(b-a)=+ve
//
//obj1-obj2(a-a)=0

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}}




