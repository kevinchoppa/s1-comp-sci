/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("enter 2 numbers to create a range");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("enter 2nd number that is bigger: ");
		int num2 = sc.nextInt();
		
		System.out.println("your range is: " + num1 + " to " + num2);
		
		int a = (int) (num1 + Math.random() * (num2-num1));
		System.out.println(a);

		int b = (int) (num1 + Math.random() * (num2-num1));
		System.out.println(b);
		
		int c = (int) (num1 + Math.random() * (num2-num1));
		System.out.println(c);
		
		int d = (int) (num1 + Math.random() * (num2-num1));
		System.out.println(d);
		
		int e = (int) (num1 + Math.random() * (num2-num1));
		System.out.println(e);
	}
}
