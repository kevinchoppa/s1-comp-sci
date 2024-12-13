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
			System.out.println("enter sentence ");
			String sentence = sc.nextLine();
			
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			
			sentence = sentence.substring(space+1);
			
			System.out.println(sentence);
	


		
	}
}
