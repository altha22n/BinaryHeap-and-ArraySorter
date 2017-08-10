import java.util.Arrays;

/**
 * ArraySorter provides sorting methods for arrays of Comparables.
 * 
 * @author Audrey St. John
 **/
public class ArraySorter {
	/**
	 * Uses selection sort algorithm to sort the array. Modifies the passed
	 * array so that its elements are in ascending, sorted order.
	 * 
	 * @return
	 **/
	
	/**
	 * method to test the ArraySoterB
	 * @param args
	 */
	public static void main(String[] args) {
		tester();
	}

	public static void tester() {

		Integer[] stringArray = { 1, 10, 5, 2, 6, 3, 7, 9, 4, 8 };
		// Integer[] stringArray = { 1,3,5,2,4};
		System.out.println("before" + Arrays.toString(stringArray));
		heapSort(stringArray);
		System.out.println("after: " + Arrays.toString(stringArray));
	}

	public static void selectionSort(Comparable[] array) {
		/* you do not need to fill this in for COMSC 211 */
	}

	/**
	 * Uses insertion sort algorithm to sort the array. Modifies the passed
	 * array so that its elements are in ascending, sorted order.
	 **/
	public static void insertionSort(Comparable[] array) {
		/* you do not need to fill this in for COMSC 211 */
	}

	/**
	 * Uses bubble sort algorithm to sort the array. Modifies the passed array
	 * so that its elements are in ascending, sorted order.
	 **/
	public static void bubbleSort(Comparable[] array) {
		/* you do not need to fill this in for COMSC 211 */
	}

	/**
	 * Uses merge sort algorithm to sort the array. Modifies the passed array so
	 * that its elements are in ascending, sorted order.
	 **/
	public static void mergeSort(Comparable[] array) {
		/* you do not need to fill this in for COMSC 211 */
	}

	/**
	 * Uses Heapsort algorithm to sort the array. Modifies the passed array so
	 * that its elements are in ascending, sorted order.
	 */
	public static void heapSort(Comparable[] array) {
		// create an instance of the class BonaryHeapA
		BinaryHeapA heap = new BinaryHeapA(array);
		// call buildMaxHelp
		heap.buildMaxHeap();
		// loop through the array length and decrement until 2
		for (int i = array.length; i >= 2; i--) {
			// swap
			heap.swap(1, i);
			// decrement heapSize
			heap.heapSize--;
			// call maxyHeapify on 1
			heap.maxHeapify(1);
		}
	}
}