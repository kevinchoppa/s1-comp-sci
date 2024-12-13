package pkg;

public class CVMath {		
	// public static int findMid(int one, int two, int three){
	// 	return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	// }
	public static void findSquare(int count) {
		
		
       int start = 1;
       while(count>0){
       	
       	
       	
           if(Math.pow( Math.pow (start , 2)*8+1 , 0.5) % 1==0){
               int square = (int)Math.pow(start,2);
               System.out.println(square);
               count--;
           }
           start++;
       }
    }
	
	
	
}
