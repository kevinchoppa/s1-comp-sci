/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String name = sc.nextLine();

		for (int i = 0; i<name.length(); i++){
			System.out.println(i + " " + name.substring(i , i+1));
			
		}


		
	}
}
