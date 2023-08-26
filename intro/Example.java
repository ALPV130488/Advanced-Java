package com.intro;

public class Example {
	
	int value=5;//global instance var
	
	static int age=3;//global static var
	
	public static void main(String[] args) {
		
		int integer=4;//local var
		
		System.out.println("Hi everyone");
		
		System.out.println(integer);
		
		Example obj = new Example();
		
		System.out.println(obj.value);
		
		System.out.println(Example.age);
		
		System.out.print("what is hell is the matter with the class");
		System.out.println("good morning");
		System.out.println("hello everyone");
		System.out.printf("%d",integer);
		
	}
	

}
