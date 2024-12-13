/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	

	public myCharacter() {
		role = new String("none");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public myCharacter(String r){
		if(r.equals("Wizard")){
			System.out.println("you are Wizard!");
			role = r;
		}
		else if (r.equals("Warrior")){
			System.out.println("you are Warrior!");
			role = r;
		}
		else if (r.equals("Rogue")){
			System.out.println("you are Rogue!");
			role = r;
		}
		else{
			System.out.println("not an option :( ");
		}
	}
	public String getRole(){
		return role;
	}
	public void cStat(){
		System.out.println("your role is " + role);
		System.out.println("your strength is " + strength);
		System.out.println("your dexterity is " + dexterity);
		System.out.println("your intelligence is " + intelligence);
		System.out.println("your charisma is " + charisma);

	}

}

