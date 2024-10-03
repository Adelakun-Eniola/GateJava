import java.util.Scanner;
import java.util.Arrays;

public class indexTask{
	public static void main(String [] args){
	   
	int[] array = {2, 1, 4, 3, 5, 9};
        System.out.println("Before: "+ Arrays.toString(array));
        arraySort(array);
        System.out.println( Arrays.toString(array));
	System.out.println(Arrays.toString(outerdex));

	}


	 public static void arraySort(int[] array) {
	        for (int index = 0; index < array.length; index++) {
            for (int outdex = index + 1; outdex < array.length; outdex++) {
                if (array[index] > array[outdex]) {
		     
                    int cup = array[index];
                    array[index] = array[outdex];
                    array[outdex] = cup;
                }
            }
        }
	
}



	public static int productArray(int [] array){
		int [] square = new int[array.length];

		for(int outerdex = 0; outerdex < array.length; outerdex++){
		square[outerdex] = array[outerdex] * array[outerdex]; 
		}
		return outerdex;
		

	}
}









     

   