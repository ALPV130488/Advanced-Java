package com.intro;

import java.util.Scanner;

public class Ifexampale {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the max marks:-");
		
		float mm = scan.nextInt();
		
		System.out.print("Enter the obtained marks:-");
		
		float om = scan.nextInt();
		
		float result =( (om/mm)*100);
		
		int value =((int)result/10)%10;
		
		
		System.out.println("result:-" + result);
		
//		System.out.println(value);
		
		System.out.print("your grade is :-");
	
		switch(value) {
		
		
		
		case 9:
		{
			
			System.out.println("distinction");
			break;
		}
		case 8:
		{
			System.out.println("good");
			break;
		}
		
		case 7:
		{
			
			System.out.println("well");
			
			break;
		}
		case 6:{
			
			System.out.println("improve well");
			
			break;
		}
		case 5:
		{
			System.out.println("average");
			break;
		}
		
		default :
		{
			
			System.out.println("fail");
			
			break;
		}
		
		
		
		
		
		
		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
