/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println(Math.max (13 - 6 * 11, 30 % 7 * (-2)));
	System.out.println(Math.sqrt (3 * 8 + 31 % 7));
	System.out.println(Math.pow (37 / 3, 35 % 21));
	System.out.println(Math.max(Math.pow( 2,14%3) , Math.sqrt ( 2*6)));

	System.out.println("give me 1 number: ");
	double num1 = sc.nextDouble();
	
	System.out.println("give me a 2nd number: ");
	double num2 = sc.nextDouble();
	
	System.out.println((("max is " ) + (Math.max (num1,num2))));
	System.out.println((("srqt is" ) + (Math.sqrt (num2))));
	System.out.println((("power is " ) + (Math.pow (num1,num2))));


	}
}
