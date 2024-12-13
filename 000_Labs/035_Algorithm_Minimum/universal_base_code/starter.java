/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int [(int)((Math.random())*150)+51];
		
		System.out.println("there are " + arr.length + " elements");
		
		for(int i = 0; i < arr.length; i++){                             
			arr[i] = (int)((Math.random()*100)+1);
		}
		int max = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(arr.length>max){
				max = arr[i];
			}
		}
		System.out.println("max of " + arr.length + " numbers is " + max );
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("min of " + arr.length + " numbers is " + min );
		
		int average = 0;
			for(int i = 0; i <arr.length; i++){
				average = average + arr[i];
			}
			System.out.println("average of " + arr.length + " numbers is " + average/arr.length);
	}
}
