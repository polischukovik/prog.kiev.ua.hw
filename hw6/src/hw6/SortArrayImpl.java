package hw6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class SortArrayImpl {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");

		int[] array = new int[1000];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		
		quickSort(array, 0,  array.length - 1 );

		end = System.currentTimeMillis();
		showArray(array);
		System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	
	
	public static void showArray( int [] arr ){
		if ( arr == null ){
			return;
		}
		System.out.println("Integer random list of " + arr.length + ":");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

}
