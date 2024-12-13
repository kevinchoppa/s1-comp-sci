/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	
		public static String PigLatin(String pig){
			if(pig.length()==1){
				return pig + "-way";
			}
			String word = pig.substring(0,1);
			String word1 = pig.substring(1,2);
				if(Vowel(word)){
					return pig + "-way";
				}
				else if (Vowel(word1)){
					return pig.substring(1)+ " - " + pig.substring(0,1) + "ay";
				}
				else{
					return pig.substring(2) + " - " + pig.substring(0,2) + "ay";
				}
		}
		public static boolean Vowel(String letter){
			return letter.contains("a") || letter.contains("e") || letter.contains("i")  || letter.contains("o") || letter.contains("u") ||letter.contains("A") || letter.contains("E")||  letter.contains("I") || letter.contains("O")|| letter.contains("U");
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("sentence");
			String sentence = sc.nextLine();
			String sentence1 = (sentence + " ");
			int counter = 0;
			String storage = "";
			
		for(int i = 0; i< sentence1.length(); i++){
			if(sentence1.substring(i, i+1).equals(" ")){
				String word = sentence1.substring(counter, i);
				storage = storage + PigLatin(word) + " ";
				counter = i;
			}
		}
		System.out.println("Pig Latin time: ");
		System.out.println(storage);
	}
}
