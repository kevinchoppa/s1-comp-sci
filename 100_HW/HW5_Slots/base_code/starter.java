/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Each player starts with $100. ");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		
		
		int moola = 100;
		String answer = "h";
		while (true) {
if (moola==0){
				System.out.println("no more money");
			break;
						}
				System.out.print("wanna play the slots? (Yes/yes/Y/y): ");
				answer = sc.nextLine();
if ((answer.equals("y")) || (answer.equals("Y")) || (answer.equals("Yes")) || (answer.equals("yes")) ){
	System.out.println("you have $" + moola + ". how much u wanna wager ");	
	}
		int wager;
		while (true){
			wager = sc.nextInt();
			sc.nextLine();

if(wager>moola){
				System.out.print("you have $" + moola + " enter smaller ");
						}
else if (wager<=0){
				System.out.print("try again: ");
						}
			else {
				moola = moola-wager;
			break;
				}
	}
		System.out.println("here");
		int firstslot = ((int)(1 + Math.random()*10));
		int secondslot = ((int)(1 + Math.random()*10));
		int thirdslot = ((int)(1 + Math.random()*10));
		System.out.println("    | " + firstslot + " | " +  secondslot + " | " + thirdslot + " | ");
if(firstslot==secondslot && firstslot==thirdslot) {
	System.out.println("triple triple");
	moola = moola + wager * 3;
	System.out.println("here is your moola $" + moola + "\n");
	}
else if (firstslot==secondslot || firstslot==thirdslot || secondslot==thirdslot) {
	moola = moola + wager * 2;
	System.out.println("double double");
	System.out.println("u got $" + moola + "\n");
	}
else{
	System.out.println("you suck bro here is your money amoutn $" + moola );
	}
	
}



	}
}
