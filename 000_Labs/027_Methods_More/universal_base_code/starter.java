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
        myCharacter character1 = new myCharacter("no ROLE PAL");
        character1.myToString();

        System.out.println("WHAT U WANNA BE? ");
        String role1 = sc.nextLine();
        myCharacter character2 = new myCharacter(role1);
        if(character2.setAll(role1, 10,10,10,10)){
            character2.myToString();
        }
        else{
            System.out.println("its not >= 0 PAL");
        }
		
	}
}
