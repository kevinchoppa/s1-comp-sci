/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

		int [] arr = new int [20];
		System.out.println(" -----------------------------------------");
		System.out.println(" there are my numbers: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)((Math.random())*10+1);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		System.out.println(" -----------------------------------------");
		int target = (int)((Math.random())*10+1);
		System.out.println("my target is " + target);

		int counter = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == target){
				System.out.println("my duplicate is " + target); 
				System.out.println("found at index " + i);
				counter++;
			}
		}
		System.out.println("the number of duplicates is " + counter);
		System.out.println(" -----------------------------------------");
		for(int i = 1; i<arr.length; i++){
			int count = i - 1;
			if(arr[i] == arr[count]){
				System.out.println("the 2 numbers in the same row " + (i-1)  + " " + i);
			}
		}

	}
}