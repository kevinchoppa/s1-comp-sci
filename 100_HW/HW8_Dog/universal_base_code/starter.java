/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dogOne = new Dog("jordan");
			dogOne.setAge(742030);
		Dog dogTwo = new Dog("poole", "dawg");
		
	if(dogOne.isSleeping()){
		System.out.print(dogOne.getName()+" is sleeping");
	}
		else{
			dogOne.bark();
			dogTwo.bark();
		}
	

	}
}
