package hw6;

public class ThreadSortArray extends SortArray {
	 
	private static int processors = Runtime.getRuntime().availableProcessors();
	
	public static int[][] divideArray(int[] array){
		
		int k = array.length / processors;
		int n = array.length % processors;
		
		int[][] distributed = new int[ processors ][ k ];
		
		for (int i = 0; i < processors; i++) {
			for (int j = 0; j < k ; j++) {
				distributed[i][j] = array[ i * k + j ];
			}
		}
		return distributed;
	}
	
	public static void showDistributedArray( int[][] arr ){
		if ( arr == null ){
			return;
		}
		int checkSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "-array " + arr[i].length + " elements: ");
			for (int j = 0; j < arr[i].length; j++) {
				checkSum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Checksum: " + checkSum + "\n");
	}
	
	public static void quickSort(int[] array, int sIndex, int eIndex){
		
	}
	
	public static void showArray( int [] arr ){
		if ( arr == null ){
			return;
		}
		int checkSum = 0;
		
		System.out.println("Integer random list of " + arr.length + ":");
		for (int i = 0; i < arr.length; i++) {
			//checkSum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//System.out.println("Checksum: " + checkSum + "\n");
	}
	
}
