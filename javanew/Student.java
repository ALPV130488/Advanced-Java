package javanew;

public interface Student {
	
	public void stuname();
	
	public void stuid();
	
	default void stdshool() {
		
		System.out.println("school name");
	}

}
