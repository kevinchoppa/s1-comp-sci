/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int [] arr = new int[1001];
		 
		 int v = 3;
		 int i = 0;
		 while(i<arr.length){
		 	arr[i] = v;
		 	System.out.print(arr[i] + ", ");

		 	i++;
		 	v = v+ 3;
		 	
		 }
		 
		 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		 int [] arr2 = new int[1001];
		 int c = 0;
		 int a = 1000;
		 while(c<arr.length){
		 	arr[c] = a;
		 	System.out.print(arr[c] + ", ");
		 	c++;
		 	a = a - 1;
		 }
		 
	}
}
