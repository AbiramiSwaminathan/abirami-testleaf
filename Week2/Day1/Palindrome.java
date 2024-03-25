package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		// declare and initialize two integers
		// one with value with other integer with 0
		int input = 123321;
		int output = 0;
		// interate the input value and find the reverse of the value
		for (int i = input; i != 0; i = i / 10) {
			int remain = i % 10;
			output = output * 10 + remain;
		}
		// check if both the values are same or not and print appropriate statements
		if (input == output) {
			System.out.println("It is a Palindrome (because the number reads the same backward and forward)");
		} else {
			System.out.println(
					"It is not a Palindrome (since the reversed number, " + output + ", is not the same as original)");
		}
	}
}
