package week2.day1;

public class IsPrime {
	public static void main(String[] args) {
		// declaring an integer
		int a;
		// adding a for loop to check and increment a by 1
		for (a = 1; a <= 10; a++) {
			// check if a is an Prime number and print the statements accordingly
			if (a % 2 == 0) {
				System.out.println(a + " is an Prime Number");
			} else {
				System.out.println(a + " is a Non - Prime Number");
			}
		}
	}
}
