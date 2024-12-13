/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("put number in:");
	int num1 = sc.nextInt();
	System.out.println("here are the next 5: \n"  + (num1+1) + " " + (num1+2) + " " + (num1+3 ) + " "+ (num1+4) + " " + (num1+5));
	sc.nextLine();
	
	System.out.println("here multiples of: " + (num1));
	System.out.println("here are the next 5 multiples: \n " + (num1) + " " + (num1*2) + " " + (num1*3 ) + " "+ (num1*4) + " " + (num1*5));
//	sc.nextLine();
	
	System.out.println("here is " + (num1) + " divided by 100");
	System.out.println((num1/100.0));

	System.out.println("here is " + (num1) + " divided by 10");
	System.out.println((num1/10.0));

	
	
	
	}
}
