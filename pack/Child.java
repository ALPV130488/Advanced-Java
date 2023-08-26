package com.pack;

class SuperParent{
	
	public void Hi() {
		
		System.out.println("Iam from superparent cls");
		
	}
	
	
}

class Parent extends SuperParent{
	
	
	
	public void displayMsg() {
		
		System.out.println("Iam from Parent class");
	}
	
	public void sub(int a ,int b) {
		
		System.out.println(a-b);
	}
	
}


public class Child extends Parent {

	public static void main(String[] args) {
		
		
		
		Child obj = new Child();
		
		obj.displayMsg();
		
		obj.sub(23, 13);
		
		obj.Hi();
		
		
		
	}
}
