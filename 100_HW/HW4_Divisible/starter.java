/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter an int ");
		int num1 = sc.nextInt();
			
		System.out.println("please enter another int ");
		int num2 = sc.nextInt();
		
if(num1%2 == 0){
		System.out.println("\nyour first number is even");
	}
		else{
			System.out.println("\nyour first number is odd");
	}
	
if(num2%2 == 0){
		System.out.println("your 2nd number is even\n");
	}
		else{
			System.out.println("you 2nd number is odd\n");
	}
	
	boolean a = num1%3 == 0;
	boolean b = num1%4 == 0;
	boolean c = num1%5 == 0;

if(a == true){
	System.out.println(num1 + " divisible by 3");
}
	else{
		System.out.println(num1 + " not divisble by 3");
	}
if(b == true){
	System.out.println(num1 + " divisible by 4");
}
	else{
		System.out.println(num1 + " not divisble by 4");
	}	
if(c == true){
	System.out.println(num1 + " divisible by 5\n");
}
	else{
		System.out.println(num1 + " not divisble by 5\n");
	}	
	
	
	
	
	
	
	
	
	boolean d = num2%3 == 0;
	boolean e = num2%4 == 0;
	boolean f = num2%5 == 0;
	
	if(d == true){
	System.out.println(num2 + " divisible by 3");
}
	else{
		System.out.println(num2 + " not divisble by 3");
	}
if(e == true){
	System.out.println(num2 + " divisible by 4");
}
	else{
		System.out.println(num2 + " not divisble by 4");
	}	
if(f == true){
	System.out.println(num2 + " divisible by 5");
}
	else{
		System.out.println(num2 + " not divisble by 5");
	}
	
	
	
	
	

		
		
		
	}
}
