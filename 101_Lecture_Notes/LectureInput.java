/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("PUT NUMBER IN: ");
        int number1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("PUT NUMBER IN: ");
        int number2 = sc.nextInt();
        sc.nextLine();

        System.out.println("SUM IS " + (number1 + number2));
        
        System.out.println("FOOD WHAT?: ");
        String food = sc.nextLine();

	}
}