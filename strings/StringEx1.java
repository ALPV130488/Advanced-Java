package strings;

public class StringEx1 {

	public static void main(String[] args) {

		String name = "apple";

		String name1 = "apple";

		String name2 = "apple";

		System.out.println(name1 == name2);// boolean=true/false

		System.out.println(name1.equals(name2));// boolean=true

		System.out.println(name2.compareTo(name1));// integer=0

		System.out.println(name2.equalsIgnoreCase(name1));// boolean=true

		System.out.println("****************************");
		
		String name3 = new String("apple");

		String name4 = new String("apple");

		String name5 = new String("apple");

		System.out.println(name4 == name5);// boolean=false

		System.out.println(name4.equals(name5));// boolean=true

		System.out.println(name5.compareTo(name4));// integer=0

		System.out.println(name5.equalsIgnoreCase(name4));// boolean=true
		
		
		StringBuffer name6 = new StringBuffer("apple");
		
		name6.append("hyderabad");
		
		System.out.println(name6);

	}

}
