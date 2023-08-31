package collection;

import java.util.HashSet;

import com.pack.Employee;

//1.utility methods
//2.similar or dismilar data
//3.the size is not fixed here
//SET:-
//4.Duplicates are not allowed
//5.Inserting order is not stored

public class SetEx {
//random order
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();//emp class obj  
	
		Employee obj = new Employee();
		

		
		Employee obj1 = new Employee("java",2334,"abcd",2334);
		
		hs.add(obj1);
		
		System.out.println(hs);
		
		

//		hs.add("spring");
//
//		hs.add("java");
//
//		hs.add("html");
//
//		hs.add("css");
//
//		hs.add("bootstrap");
//
//		System.out.println(hs);
//		
//		hs.add("html");
//
//		hs.add("css");
//
//		hs.add("mango");
		
//		System.out.println(hs);
		
		

	}

}
