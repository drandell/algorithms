public class Algorithms {
	//Source@ http://rosettacode.org/wiki/Sorting_algorithms/Counting_sort#Java
	public static void countingSort(int[] array, int min, int max) {
		int[] count= new int[max - min + 1];
		for(int number : array) {
			count[number - min]++;
		}
		int z= 0;
		for(int i= min;i <= max;i++){
			while(count[i - min] > 0){
				array[z]= i;
				z++;
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
		}
	}
}
