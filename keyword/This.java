package keyword;

class Senior1 {

	int value = 45;

	public Senior1() {
		System.out.println("Iam from parent class default constructor");
	}

	public Senior1(String name) {
		System.out.println("Iam from Parent class p.constructor name:-" + name);
	}

	public int age(int age) {
		return age;
	}

}

public class This extends Senior1 {

	int value = 54;

	public This() {
		
		super("java");//parent cls p.constr
		
		
		
		int value = 36;

		System.out.println(value);//
		
		System.out.println(this.value);//calls current cls prop's 
		
		System.out.println(super.value);//calls parent cls prop's

	}

	public This(int age) {
		
		this();//default constr of the current cls

		System.out.println("Iam from child class pa.constr age:-" + age);

	}

	public int age(int age) {
		return age;
	}

	public static void main(String[] args) {
		
		
		This obj = new This(89);

	}
}
