/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("sentence please");
	String str = sc.nextLine();
	toString(str);
	
	System.out.println("sentence please");
	String str2 = sc.nextLine();
	toStringcombined(str, str2);
	
	
	}
	public static void toString(String str){
		System.out.println(str);
	}
	public static void toStringcombined(String str, String str2){
		System.out.println(str + str2);
	}
	
}
