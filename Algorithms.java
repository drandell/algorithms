import java.util.Arrays;

public class Algorithms {
	public static int getMaxValue(int[] array) {
		int maxValue = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] > maxValue) {
		    	maxValue = array[i];
		    }
		} 
		return maxValue;
	}
	
	public static int getMinValue(int[] array) {  
	     int minValue = array[0]; 
	     
	     for(int i = 1; i < array.length; i++) {  
	    	 if(array[i] < minValue) {  
	    		 minValue = array[i];  
	    	 }  
	     }  
	    return minValue;  
	} 
	
	//Source@ http://rosettacode.org/wiki/Sorting_algorithms/Counting_sort#Java
	public static void countingSort(int[] array, int min, int max) {
		//Create Counter Array
		int[] count= new int[max - min + 1];
		for(int number : array) {
			//Increment counter array of counts 
			count[number - min]++;
		}
		int z= 0;
		for(int i= min;i <= max;i++){
			//Loop through array of counters starting at min
			while(count[i - min] > 0){
				//Place sorted i into array at z
				array[z]= i;
				z++;
				//decrement counter after being sorted
				count[i - min]--;
			}
		}
	}
		
	//Source@ http://rosettacode.org/wiki/Sorting_algorithms/Insertion_sort#Java
	public static void insertSort(int[] A) {
		for(int i = 1; i < A.length; i++) {
			//Get value of array element at iter i
			int value = A[i];
			int j = i - 1;
			//Swap elements whilst the "value" is less than the value of array[j] 
			while(j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			//"value" can no longer move
			A[j + 1] = value;
			
			//Sample Data - Half way results!
			//if (i == A.length / 2) {
			//	System.out.println("Intermediary sort: " + Arrays.toString(A));
			//}
			
		}
	}
}
