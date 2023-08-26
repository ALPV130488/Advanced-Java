package com.intro;

import java.util.Date;

public class Method {
	
	int vlaue=34;
	
	public void dispalyDate() {
		
		System.out.println("Today's date is:-" + new Date());
		
	}
	
	public String dispalyMsg() {
		
		return "Hi everyone!!!!";
	}
	
	public static int add(int a,int b) {
		
		return (a+b);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Method.add(2, 3));
		
		Method obj = new Method();
		
		obj.dispalyDate();
		
		System.out.println(obj.dispalyMsg());
		
		System.out.println(obj.add(4, 5));
		
		
		System.out.println(obj.vlaue);
		
		
	}

}
