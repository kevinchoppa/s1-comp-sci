/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = sc.nextLine();
		
		System.out.println("how many times do you want ");
		int times = sc.nextInt();
		int	count = 0;
while(count<times){
	count++;
	System.out.println(name);

}
		

		
	}
}
