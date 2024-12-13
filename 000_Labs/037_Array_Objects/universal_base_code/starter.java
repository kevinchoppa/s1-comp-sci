/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] wiz = new Wizard [100];
		Warrior [] war = new Warrior [100];
		for(int i = 0; i<wiz.length; i++){
			wiz[i] = new Wizard();
		}
		for(int i = 0; i<war.length; i++){
			war[i] = new Warrior();
		}
		int warDead = 0;
		int wizDead = 0;
		while(wizDead<100 && warDead<100){
			war[warDead].attack(wiz[wizDead]);
				if(wiz[wizDead].isDead()){
					wizDead++;
				}
				if(wizDead == 100 || warDead == 100){
					break;
				}
			wiz[wizDead].attack(war[warDead]);
				if(war[warDead].isDead()){
					warDead++;
				}
				if(wizDead == 100 || warDead == 100){
					break;
				}
		}
		if(wizDead > warDead){
			System.out.println("warriors have won with " + (100-wizDead));
		}
		else{
			System.out.println("wizards have won with " + (100-warDead));
		}
	}
}
