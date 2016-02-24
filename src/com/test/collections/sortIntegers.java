package com.test.collections;

import java.util.TreeSet;

/**
 * This class will sort the Integers
 * 
 * @author ank
 *
 */
public class sortIntegers {

	private Integer[] i = { 2, 4, 6, 1, 0, 5, 3, 7, 10, 8, 9 };
	private TreeSet<Integer> ts = new TreeSet<Integer>();

	/**
	 * Constructor
	 */
	public sortIntegers() {
		System.out.println("Sorting the Integers");
		sortNumAscending(i);
		sortNumDescending(ts);

	}

	/**
	 * This method will return the sorted Integer array in Ascending order.
	 * 
	 * @param i
	 */
	private TreeSet<Integer> sortNumAscending(Integer[] i) {
		for (int j = 0; j < i.length; j++) {
			ts.add(i[j]);
		}
		System.out.println("Ascending, Sorted Integers : \n\t" + ts);
		return ts;
	}

	/**
	 * This method will return the sorted Integer array in Descending order.
	 * 
	 * @param i
	 */
	private void sortNumDescending(TreeSet<Integer> ts) {
		System.out.println("Descending, Sorted Integers : \n\t" + ts.descendingSet());
	}

	public static void main(String[] args) {
		sortIntegers s = new sortIntegers();
	}

}
