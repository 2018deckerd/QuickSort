
public class QuickSorter {
	

	public static void quickSort(int[] arr, int lo, int hi) {
		/*
		 * Implement the quick sort algorithm on the integer array arr[]
		 * starting at index lo and ending at index hi.
		 */
		int pivotIndex = 0;
		if (lo < hi) {
			pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, hi);
	}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		/*
		 * Partition the integer array arr[] from lo to hi.
		 * Should return the index of the pivot element.
		 */
		int iIndex = lo + 1;
		int jIndex = hi;
		int tempVariable = 0;
		int pivotElement = arr[lo];
		
		// loop to check whether the left index has exceeded the right index 
		while (iIndex <= jIndex) {
			// moves the left pointer until it is greater than the pivot element
		while (arr[iIndex] <= pivotElement && iIndex != arr.length - 1) {
			iIndex++;
		} 
		
		if (iIndex == (arr.length - 1)) {
			tempVariable = pivotElement;
			arr[0] = arr[iIndex];
			arr[iIndex] = tempVariable;
		}
		// moves the right pointer until it is less than the pivot value
		while (arr[jIndex] > pivotElement && jIndex != (lo + 1)) {
			jIndex--;
		}
		
		// Swaps elements to continue with partioning
		if (iIndex < jIndex) {
			tempVariable = arr[iIndex];
			arr[iIndex] = arr[jIndex];
			arr[jIndex] = tempVariable;
		}
		
		if (iIndex == jIndex && jIndex == (arr.length - 1)) {
			break;
		}
		
		} 
		
		
		// action to complete if the right index has went over the left index
		if (jIndex < iIndex) {
			tempVariable = pivotElement;
			arr[0] = arr[jIndex];
			arr[jIndex] = tempVariable;
		}
		
		
		return jIndex;
	}
	
}
