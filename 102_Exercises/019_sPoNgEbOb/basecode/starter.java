/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(spongease(word));
			
			
			sentence = sentence.substring(space+1);
		}
		
		
	}
	public static String spongeCase(String word){
		String result = " ";
		
		for(int i = 0; i < word.length(); i++){
			String letter = word.subString(i, i+1);
			
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}	
			result = result + letter;
		
		
		}
		return result;
	}
}