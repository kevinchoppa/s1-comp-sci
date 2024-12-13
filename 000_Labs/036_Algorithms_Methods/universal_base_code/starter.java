/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[100];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*100+1);
		}
		toStringArray(arr);
		System.out.print(getArrayAverage(arr));
		System.out.print(getArrayMax(arr));
		System.out.print(getArrayMin(arr));
	}
	public static void toStringArray(int[] x){
		for(int i = 0; i<x.length; i++){
			System.out.print(x[i]+" ");
		}
	}
	public static int getArrayAverage(int[] x){
		int avad = 0;
		for(int i = 0; i<x.length; i++){
			avad = avad + x[i];
		}
		int average = avad / x.length;
		return average;
	}
	public static int getArrayMax(int[] x){
		int maxi = Integer.MIN_VALUE;
		for(int i = 0; i<x.length; i++){
			if(x[i]>maxi){
					maxi = x[i];
			}
		}
		return maxi;
	}
	
}
