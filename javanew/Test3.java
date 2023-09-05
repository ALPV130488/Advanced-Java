package javanew;

public class Test3 {
	
	public static void main(String[] args) {
		
		Multiplication obj = new Multiplication();
		
		obj.mul(2, 3);
		
		Multiplication1 obj1=Multiplication::mul;
		
		
		obj1.mul(4, 6);
	}

}
