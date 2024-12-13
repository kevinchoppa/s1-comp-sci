/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme name");
		String name = sc.nextLine();
		
		System.out.println("gimme title");
		String title = sc.nextLine();
		
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

System.out.println("20 skill points to spend on strength, dexterity, intelligence, and charisma. Spend them wisely.");
		System.out.println("pick strength (1-10): ");
		int strength = sc.nextInt();
		int full1 = 20;
		if (strength > 10 || strength < 0){
			System.out.println("thats not an option \ntry again");
			strength = sc.nextInt();
		}
			else{
				System.out.println("you chose " + strength + " strength pts");
			}
			
			
			
			
		int full2 = full1 - strength;
		System.out.println(full2 + " pts remain");
		System.out.println("pick dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if (dexterity > 10 || dexterity < 0){
			System.out.println("thats not an option \ntry again");
			dexterity = sc.nextInt();
		}
			else{
				System.out.println("you chose " + dexterity + " dexterity pts");
			}
			
			
			
			
			
		int full3 = full2 - dexterity;
		System.out.println(full3 + " pts remain");
		System.out.println("pick intelligence (1-10): ");
		int intelligence = sc.nextInt();
		
		
		int full4 = full3 - intelligence;
		if (intelligence > 10 || intelligence < 0){
			System.out.println("thats not an option \ntry again");
			intelligence = sc.nextInt();
		}
			else if (full4 < 0){
			System.out.println("not option, do it again ");
			intelligence = sc.nextInt();
			System.out.println("you chose " + intelligence + " intelligence pts");
			}
			
			
			System.out.println(full4 + " pts remain");
			System.out.println("pick charisma 1-10 ");
			int charisma = sc.nextInt();
			int full5 = full4 - charisma;
			if (charisma > 10 || charisma < 0){
			System.out.println("thats not an option \ntry again");
			charisma = sc.nextInt();
		}
			else if (full5 < 0){
			System.out.println("not option, do it again ");
			charisma = sc.nextInt();
			System.out.println("you chose " + charisma + " charisma pts");
			}
			System.out.println(full5 + " pts remain");

			System.out.println("--------------------------------------------------");
			System.out.println("you are " + name + "," + " the " + title + " of cvhs");
			System.out.println("here are your stats");
			System.out.println("Strength = " + strength);
			System.out.println("dexterity = " + dexterity);
			System.out.println("intelligence = " + intelligence);
			System.out.println("charisma = " + charisma);
		
			System.out.println("go on ur qeust");	
		
		
		
		
		
		
	}
}
