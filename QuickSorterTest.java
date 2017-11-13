import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSorterTest {

	@Test
	public void testQuickSort() {
		// first test case
		int[] testArray = {1, 3, 5, 2};
		QuickSorter.quickSort(testArray, 0, 3);
		for (int element : testArray) {
			System.out.print(element + " ");
		}
		int[] sorted = {1, 2, 3, 5};
		assertTrue(Arrays.equals(testArray, sorted));
		/**
		// second test case
		int[] testArray2 = {7, 3, 4, 9, 5, 10, 1, 6, 12, 2, 11, 8};
		QuickSorter.quickSort(testArray2, 0, 11);
		for (int element : testArray2) {
			System.out.print(element + " ");
		}
		int[] sorted2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		assertTrue(Arrays.equals(testArray2, sorted2));
		*/
	}

	@Test
	public void testPartition() {
		// first test case
		int[] testArray = {7, 3, 4, 9, 5, 10, 1, 6, 12, 2, 11, 8};
		int partitionIndex = 0;
		partitionIndex = QuickSorter.partition(testArray, 0, 11);
		assertTrue(partitionIndex == 6); 
		
		// second test case
		int[] testArray2 = {7, 5, 3};
		int partitionIndex2 = 0;
		partitionIndex2 = QuickSorter.partition(testArray2, 0, 2);
		assertTrue(partitionIndex2 == 2);
		
	}

}
