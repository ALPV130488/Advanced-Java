package com.pack;

interface Parent1{
	
	public void add(int a,int b);
	
}

interface Parent2{
	
	public void add(int a,int b);
	
}



public class Child2 implements Parent1,Parent2{


	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		obj.add(2, 3);
	}

	@Override
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
}
