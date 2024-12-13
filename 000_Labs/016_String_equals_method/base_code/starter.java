/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pick wizard rogue or warrior");
		String choice = sc.nextLine();
		
		
		
		
		if(choice.equals("wizard") || choice.equals("Wizard")){
			System.out.println("excelsior!");
		}
			else if (choice.equals("rogue") || choice.equals("Rogue")){
				System.out.println("how cunning!");
			}
			else if (choice.equals("warrior") || choice.equals("Warrior")){
				System.out.println("for honor");
			}
			else{
				System.out.println("that wasnt a choice pal");
			}
		
		
		
		 
	}
}
