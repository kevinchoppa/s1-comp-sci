/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 7, 9, 2, 8, 3, 8, 1};
        
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]);
        }
        int dupeCheck = 8;
        for(int i = 0; i <arr.length; i++){
            if(dupeCheck == arr[i]){
                System.out.println(i);
            }
        }
        for(int i = 0; i <arr.length; i++){
            if( Math.abs(arr[i] - arr[i+1]) == 3){
                System.out.println(i);
	    }
    }
    int [] arr2 = {3, 4, 2, 7, 8, 1, 3, 2, 0, -1, 4};
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<arr2.length; i++){
            if(arr2[i]>max)
                max = arr2[i];
        }
    
}
}