package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersacetionInList {
	public static void main(String[] args) {
		// declare and initialize two arrays with integer datatypes

		int[] numArray1 = { 3, 2, 11, 4, 6, 7 };
		int[] numArray2 = { 1, 2, 8, 4, 9, 7 };

		// create three lists, two for taking values from the array and one for taking
		// the same values
		List<Integer> numList1 = new ArrayList<Integer>();
		List<Integer> numList2 = new ArrayList<Integer>();
		List<Integer> commonList = new ArrayList<Integer>();

		// create a for loop to add all the values from array1 to list1
		for (int i = 0; i < numArray1.length; i++) {
			numList1.add(numArray1[i]);

		}
		// create a for loop to add all the values from array2 to list2
		for (int i = 0; i < numArray2.length; i++) {
			numList2.add(numArray2[i]);

		}

		// create a for loop to check both the lists to check for same values
		for (int num : numList1) {
			// If they have same values, add those values to the third list
			if (numList2.contains(num)) {
				commonList.add(num);
			}

		}
		System.out.println("The first List :" + numList1);
		System.out.println("The first List :" + numList2);
		// print the thrid list value
		System.out.println("The Same Numbers in Both the Arrrays are : " + commonList);
	}
}
