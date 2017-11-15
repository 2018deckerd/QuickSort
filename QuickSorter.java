
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
		boolean complete = true;
		
		// loop to check whether the left index has exceeded the right index 
		while (iIndex <= jIndex) {
			// moves the left pointer until it is greater than the pivot element
		while (arr[iIndex] < pivotElement) {
			iIndex++;
			if (iIndex > hi) {
				tempVariable = arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = tempVariable;
				break;
			}
		}
			if (iIndex > hi) {
				complete = true;
				break;
		}
	
		
		// moves the right pointer until it is less than the pivot value
		while (arr[jIndex] >= pivotElement) {
			jIndex--;
			if (jIndex == lo) {
				complete = true;
				break;
			}
		}
		
		
		// Swaps elements to continue with partioning
		if (iIndex < jIndex) {
			tempVariable = arr[iIndex];
			arr[iIndex] = arr[jIndex];
			arr[jIndex] = tempVariable;
			iIndex++;
			jIndex--;
			complete = false;
		}
		
		if (iIndex == hi && jIndex < iIndex && jIndex != hi) {
			complete = false;
		}
		
		
		} 
		
		
		// action to complete if the right index has went over the left index
		if (jIndex < iIndex) {
		  if (!complete) {
			tempVariable = arr[lo];
			arr[lo] = arr[iIndex - 1];
			arr[iIndex - 1] = tempVariable;
		  } else {
			  
		  }
		}
			
		return jIndex;
	}
	
}
