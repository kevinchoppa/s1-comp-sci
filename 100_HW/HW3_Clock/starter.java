/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter what day it is 0-6 ");
		int day = sc.nextInt();

		if(day <0 || day>6){
			System.out.println("not valid");
		}
			else if(day == 0 || day == 6){
			System.out.println("10am");
		}
			else {
			System.out.println("7am");
		}
		
		
	}
}
