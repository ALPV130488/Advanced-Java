package keyword;

class Parenta {

	final int value = 23;

  final	public void dispaly() {

		System.out.println("hi everyone!!!!");
	}

}

public class Key  extends Parenta{

	public static void main(String[] args) {

		Key obj = new Key();
		
//		obj.value = 45;

		System.out.println(obj.value);

		obj.dispaly();

	}

//	@Override
//	public void dispaly() {
//
//		System.out.println("Good Morning!!!!");
//	}

}
