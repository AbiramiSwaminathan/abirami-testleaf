package week2.day1;

import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		// declare and initalize an integer arrray with duplicate values
		int num[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		// Sort the array list
		Arrays.sort(num);
		// do a for loop to iterate every value in the array to check for duplicates
		System.out.println("Duplicate Numbers Are :");
		for (int i = 1; i < num.length; i++) {
			// if the duplicate condition is met, then print that value alone
			int chkValue = num[i - 1];
			if (chkValue == num[i]) {
				System.out.println(num[i]);
			}
		}
	}
}
