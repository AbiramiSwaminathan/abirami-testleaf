package week2.day1;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] input = { 1, 2, 6, 7, 3, 5 };

		// find the max number in the array
		// declare and initialize an integer
		int max = input[0];
		// run a for loop and compare every element with the max value
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		// find the sum of the array values
		// declare and initialize an integer
		int sum = 0;
		// run a for loop and calculate the sum of the array elements
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		// declare and initalize an integer
		// using the appropriate calculations, find the missing number and print the
		// output
		int missnum = (max * (max + 1) / 2) - sum;
		System.out.println("The missing number is " + missnum);

	}
}
