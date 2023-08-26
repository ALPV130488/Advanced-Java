package com.pack;

class Parent6{
	
	public void marriage() {
		
		System.out.println("Unknown Girl");
	}
	
}

public class Child5 extends Parent6{
	
	public static void main(String[] args) {
		
		Child5 obj = new Child5();
		
		obj.marriage();
		
	}
	@Override
	public void marriage() {
		
		System.out.println("Kajol");
	}
}
