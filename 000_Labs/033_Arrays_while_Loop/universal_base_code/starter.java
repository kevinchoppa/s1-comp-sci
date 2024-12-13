/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int [1000];
		int i = 0;
		while(i<arr.length){
			int rand = (int)(Math.random()*1000);
			arr[i] = rand;
			System.out.println(arr[i]);
			i++;
		}
	


		
	}
}
