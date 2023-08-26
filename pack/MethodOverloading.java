package com.pack;

public class MethodOverloading {
	
	public void add(int a, int b) {
		System.out.println("sum of two integer are:-"+(a+b));//1
	}
	
	public void add(int a ,int b,int c) {
		
		System.out.println("sum of three integers are:-"+(a+b+c));//2
	}
	public void add(float a,float b) {
		System.out.println("sum of two floats are:-"+(a+b));//3
	}
	
	public void add(int a, float b) {
		
		System.out.println("sum of one integer and one float is:-"+(a+b));//4
	}
	public void add(float a,int b) {
		
		System.out.println("sum of one float and one integer:-"+(a+b));//5
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj =new MethodOverloading();
		
		obj.add('a','b');
		
	}
	

}
