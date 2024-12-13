/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me first name: ");
		String name = sc.nextLine();
		System.out.println("Hello, your name is " + name);

		System.out.println("Give me age: ");
		int age = sc.nextInt();
		System.out.println("Hello, you are " + age);
		sc.nextLine();

		System.out.println("Give me your month: ");
		String month = sc.nextLine();
		System.out.println("Hello, you are born in " + month);
		
		System.out.println("Give me your birthday day: ");
		int day = sc.nextInt();
		System.out.println("Hello, you are born on " + day);
		sc.nextLine();

		System.out.println("Give me your birthday year: ");
		int year = sc.nextInt();
		System.out.println("Hello, you are born in " + year);
		sc.nextLine();
		
		System.out.println("how much buck fifty ");
		double buck = sc.nextDouble();
		System.out.println("Hello, buck fifty is: " + buck);
		sc.nextLine();

	}
}
