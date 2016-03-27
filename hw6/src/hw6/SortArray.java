package hw6;

import java.util.Arrays;

public class SortArray {

	public static int[] sortBoubble(int[] array) {
		int t;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if ( array[i] > array[j] ){
					t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}
		return array;
	}
	
	public static int[] sortNative(int[] array) {
		Arrays.sort(array);
		return array;
	}


}
