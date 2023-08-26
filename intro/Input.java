package com.intro;//ctrl+shift+o

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		// declaration of a var

		System.out.print("Enter your value:-");

		Scanner scan = new Scanner(System.in); // Obj creation

		int value = scan.nextInt();

		System.out.println("value  :-" + value);

	}

}
