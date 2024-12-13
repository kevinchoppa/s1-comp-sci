/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("gimme 1st number ");   
		int num1 = sc.nextInt();
		
		System.out.println("gimme a 2nd one ");    
    	int num2 = sc.nextInt();

		System.out.println("gimme a 3rd one ");    
    	int num3 = sc.nextInt();
    	
    	if (num1>num2 && num1>num3){
    		System.out.println("1st number is biggest NUMBER");
    	}
    	
    	if (num2>num1 && num2>num3){
    		System.out.println("2nd  number is biggest NUMBER");
    	}
		if (num3>num1 && num3>num2){
    		System.out.println("3rd number is biggest NUMBER");
    	}
    	if (num1<num2 && num1<num3){
    		System.out.println("1st number is smallest number");
    	}
    	if (num2<num1 && num2<num3){
    		System.out.println("2nd  number is smallest NUMBER");
    	}
    	if (num3<num1 && num3<num2){
    		System.out.println("3rd number is smallest NUMBER");
    	}
		
		
		
	}
}
