package week2.day2;

public class ReverseOddWords {
	public static void main(String[] args) {
		// declare and initialize input string
		String input = "My name is Abirami";
		// Declare and initialize char string by splitting the input string
		String[] inputarray = input.split("\\s+");
		// declare an output string and a char array to fold the odd indexed words
		String output = "";
		char[] arrayName;
		//create a for loop to find the odd index words
		for (int i = 0; i < inputarray.length; i++) {
			if (i % 2 != 0) {
				arrayName = inputarray[i].toCharArray();
				inputarray[i] = "";
				// create a for loop to reverse the odd index words
				for (int j = arrayName.length - 1; j >= 0; j--) {

					inputarray[i] += arrayName[j];
				}
			}
		}
		// create a for loop to concatenate the modified output
		for (int j = 0; j < inputarray.length; j++) {
			output = output + " " + inputarray[j];
		}
		// print the output
		System.out.println(output);
	}
}
