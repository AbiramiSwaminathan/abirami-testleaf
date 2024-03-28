package week2.day2;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String input = "We learn Java basics as part of java sessions in java week1";
		// declare two string arrays to split and store the input
		String[] words = input.split("\\s+");
		String[] result = input.split("\\s+");

		// declare a string for storing and displaying the modified words
		String output = "";

		// declare and initialize an integer to keep track of the duplicate words
		int count = 0;

		// create a nested for loop to compare each word from the 1st string array to
		// all the words in the 2nd string array
		for (int i = 0; i < words.length; i++) {
			// Initialize the count to 0
			count = 0;
			for (int j = i + 1; j < words.length; j++) {
				// if a duplicate word is found, replace the 2nd string arrray with empty string
				// and increment the count
				if (words[i].toLowerCase().equals(result[j].toLowerCase())) {
					result[j] = "";
					count = count + 1;
				}

			}
			// if the count is greater than 1, create a for loop to print the output by
			// concatenating the modified string array to the output strin
			if (count >= 1) {
				for (int j = 0; j < result.length; j++) {
					output = output + " " + result[j];
				}
			}

		}
		// print the output
		System.out.println(output);

	}
}
