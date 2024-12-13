/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		

		int secret = (int)(Math.random()*1000)+1;
	//	System.out.println(secret);

		while(true){
			
					System.out.println("\npick a number 1-1000");
		int guess = sc.nextInt();

			
			if(guess<secret){
	
				System.out.print("too low");
			}
			else if (guess>secret){
				System.out.print("too high");
			}
			else if (guess == secret){
				System.out.print("you got it");
				break;
			}

			


}


		
	}
}
