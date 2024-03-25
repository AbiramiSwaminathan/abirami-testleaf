package week2.day1;

public class FindOddNumbers {
	public static void main(String[] args) {
		// declaring an integer
		int a;
		// adding a for loop to check and increment a by 1
		for (a = 1; a <= 10; a++) {
			// check if a is an odd number
			if (a % 2 != 0)
				// Printing the odd number
				System.out.println(a + " is an Odd Number");

		}
	}
}
