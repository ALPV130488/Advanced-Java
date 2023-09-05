package javanew;

@FunctionalInterface
interface Calculator {

	public abstract void display();

}

class Test2 implements Calculator {

	@Override
	public void display() {
		System.out.println("sum of the integers is:-");

	}

}

public class Test {

	public static void main(String[] args) {
		
	Test2 obj = new Test2();
	
	obj.display();
	
	Calculator cal1= new Calculator() {
		public void display() {
			System.out.println("sum of the integers is:-" );

		}
	};
	
	
	Calculator cal= ()->
			System.out.println("using lambda :-");
			
	cal1.display();
	
	cal.display();
	
		
		
	}

}
