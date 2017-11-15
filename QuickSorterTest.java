import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSorterTest {

	@Test
	public void testQuickSort() {
		// first test case (extreme case where list is reversed)
		int[] testArray = {7, 5, 2};
		QuickSorter.quickSort(testArray, 0, 2);
		int[] sorted = {2, 5, 7};
		assertTrue(Arrays.equals(testArray, sorted));
		
		// second test case (random list of numbers)
		int[] testArray2 = {7, 3, 4, 9, 5, 10, 1, 6, 12, 2, 11, 8};
		QuickSorter.quickSort(testArray2, 0, 11);
		int[] sorted2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		assertTrue(Arrays.equals(testArray2, sorted2));
		
		// third test case (extreme case where list is already in order)
		int[] testArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		QuickSorter.quickSort(testArray3, 0, 11);
		int[] sorted3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		assertTrue(Arrays.equals(testArray3, sorted3));
			
		// fifth test case (another extreme case where list is already in order)
		int[] testArray5 = {-3, 3, 5};
		QuickSorter.quickSort(testArray3, 0, 3);
		int[] sorted5 =  {-3, 3, 5};
		assertTrue(Arrays.equals(testArray5, sorted5));
		
		// sixth test case (random number, quite extreme)
		int[] testArray6 = {7, 5, -3, 3, -5, 10};
		QuickSorter.quickSort(testArray6, 0, 5);
		int[] sorted6 = {-5, -3, 3, 5, 7, 10};
		assertTrue(Arrays.equals(testArray6, sorted6));
		
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
	
	@Test
	// tests binary search using the Quick Sort Algorithm
	public void testBinarySearch() {
		int[] test1 = {13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
		QuickSorter.quickSort(test1, 0, 14);
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 14, 1));
		assertEquals(14, BinarySearcher.binarySearch(test1, 0, 14, 15));
		assertEquals(5, BinarySearcher.binarySearch(test1, 0, 14, 6));
		int[] test2 = {9, -2, 3, 7};
		QuickSorter.quickSort(test2, 0, 3);
		assertEquals(2, BinarySearcher.binarySearch(test2, 0, 3, 7));
		assertEquals(-1, BinarySearcher.binarySearch(test2, 0, 3, 10));
		assertEquals(0, BinarySearcher.binarySearch(test2, 0, 3, -2));
		int[] test3 = {7, 8, 9};
		QuickSorter.quickSort(test3, 0, 2);
		assertEquals(0, BinarySearcher.binarySearch(test3, 0, 2, 7));
		assertEquals(-1, BinarySearcher.binarySearch(test3, 0, 2, 10));
		assertEquals(2, BinarySearcher.binarySearch(test3, 0, 2, 9));
	}

}
