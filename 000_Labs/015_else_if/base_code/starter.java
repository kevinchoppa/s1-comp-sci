/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("pick a number that is a number from 1 to 1000");
	int guess = sc.nextInt();
	int rand = (int)(1+(Math.random()*999));

	
	if (guess > rand){
		System.out.println("its too high buddy, it was " + rand);
	}
		else if (guess < rand){
			System.out.println("too low man " + rand);
		}
		else{
			System.out.println("good job");
		}
		
		
		
		
		
		
		
		
	}
}
