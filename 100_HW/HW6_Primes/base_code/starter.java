/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num and well print all prime until reach that num ");
		int num = sc.nextInt();
	printPrimes(num);
	
	
	}
	public static boolean checkPrime(int para){
		int count = para - 1;
		while(count>1){
			if(para%count == 0){
				return false;
			}
			count--;
		}
		return true;
	}
	public static void printPrimes(int meter){
		while(meter>1){
			if(checkPrime(meter) == true){
				System.out.println(meter);
			}
			meter--;
		}
	}
	
}
