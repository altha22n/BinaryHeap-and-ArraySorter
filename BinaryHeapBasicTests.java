import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by peter on 2/7/17.
 *
 */
public class BinaryHeapBasicTests {
	// we use a BinaryHeapA variable here
	// because we want to test the internal
	// methods of the BinaryHeapA, not just
	BinaryHeapA<Integer> emptyBHA;
	BinaryHeapA<Integer> filledBHA;

	@Before
	public void init() {
		//create heaps 
		emptyBHA = new BinaryHeapA<Integer>(10);
		Integer[] stringArray = { 1, 10, 5, 2, 6, 3, 7, 9, 4, 8 };
		filledBHA = new BinaryHeapA<Integer>(stringArray);
	}
	/**
	 * Check getElement
	 */
	@Test
	public void getElementTest() {
		Integer expected = 2;
		assertEquals("getElement  test", expected, filledBHA.getElement(8));
		//add an element and test again
		filledBHA.addElement(2);
		assertEquals("getElement  test", 6, filledBHA.getElement(10));
	}
	/**
	 * test addElement
	 */
	@Test
	public void addElementTest() {
		emptyBHA.addElement(10);
		assertEquals("addElement test", ((Integer) 10), emptyBHA.getElement(1));
	}
	/**
	 * test leftChild
	 */
	@Test
	public void leftChildTest() {
		assertEquals("leftChild test", 2, filledBHA.leftChild(1));
	}
	/**
	 * test rightChild
	 */
	@Test
	public void rightChildTest() {
		assertEquals("empty size test", 3, filledBHA.rightChild(1));
	}
	/**
	 * test parent
	 */
	@Test
	public void parentTest() {
		assertEquals("empty size test", 2, filledBHA.parent(5));
	}
	/**
	 * test capacity
	 */
	@Test
	public void capacityTest() {
		assertEquals("empty size test", 9, emptyBHA.capacity());
	}
	/**
	 * test size
	 */
	@Test
	public void sizeTest() {
		assertEquals("empty size test", 0, emptyBHA.size());
	}
	/**
	 * test setSize
	 */
	@Test
	public void setSize() {
		filledBHA.setSize(filledBHA.size() - 1);
		assertEquals("set size test", 9, filledBHA.size());
	}
	/**
	 * test swap
	 */
	@Test
	public void swapTest() {
		Integer expected = 9;
		//call swap
		filledBHA.swap(1, 2);
		assertEquals("swap test", expected, filledBHA.getElement(1));
	}
	/**
	 * test buildMaxHeap
	 */
	@Test
	public void buildMaxHeap() {

		Integer expected = 6;
		assertEquals("buildMaxHeap test", expected, filledBHA.getElement(10));
	}
	/**
	 * test maxHeapify
	 */
	@Test
	public void maxHeapifyTest() {
		//create another small array to make sure it;s working 
		Integer[] stringArray2 = { 2, 1, 3 };
		BinaryHeapA<Integer> filledBHA2 = new BinaryHeapA<Integer>(stringArray2);
		//print statements
		System.out.println(filledBHA.leftChild(2));
		System.out.println(filledBHA.rightChild(2));
		System.out.println(Arrays.toString(filledBHA.getArray()));
		//testing both BHA
		assertEquals("maxHeap test", 3, filledBHA2.getElement(1));
		assertEquals("maxHeap test", 10, filledBHA.getElement(1));
	}
	/**
	 * test isEmpty
	 */
	@Test
	public void isEmptyTest() {
		assertEquals("isEmpty Test", true, emptyBHA.isEmpty());
		assertEquals("isEmpty Test", false, !emptyBHA.isEmpty());
	}

}
