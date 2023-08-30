package keyword;

class Senior {

	int apple = 34;

	public Senior() {
		System.out.println("Iam from Parent cls consrutor");
	}

	public void dispaly() {
		System.out.println("Iam from Parent cls p.constr ");
	}

}  

public class Junior extends Senior {

	int apple = 56;

	public Junior() {

		super();
		System.out.println("Iam from Child class constr");

	}

	public void dispaly() {
		

		System.out.println(super.apple);//parent var

		super.dispaly();
		
		System.out.println(apple);//current var
		
	

	}

	public static void main(String[] args) {
		
		Junior obj = new Junior();

		obj.dispaly();
	}

}
