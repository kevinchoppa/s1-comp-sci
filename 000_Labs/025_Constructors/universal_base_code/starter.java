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
		
		myCharacter character = new myCharacter();
		character.cStat();
		System.out.println();
		System.out.println("Wizard, Warrior, Rogue? ");
		String response = sc.nextLine();
		myCharacter characterman = new myCharacter(response);
		System.out.println();
		characterman.cStat();



		
	}
}
