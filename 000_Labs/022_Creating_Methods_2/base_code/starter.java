/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("base number: ");
		 int base = sc.nextInt();
		 
		 System.out.print("exponent number: ");
		 int exponent = sc.nextInt();

	int finalnum = pow(base, exponent);
	System.out.println(finalnum);
			
	}
	
	public static int pow(int base, int exponent){
		int count = 1;
		int base1 = base;
		while(count<exponent){
			base1 = base1 * base;
			count++;
		} 
		return base1;
		
}
}