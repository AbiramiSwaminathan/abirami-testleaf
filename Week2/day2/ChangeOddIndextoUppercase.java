package week2.day2;

public class ChangeOddIndextoUppercase {
	public static void main(String[] args) {
		// declare and initialize a string
		String Name = "abirami";
		// convert the string values into an char array
		char[] charName = Name.toCharArray();

		// declaring an integer
		int a;
		// adding a for loop to check and increment a by 1
		for (a = 0; a < charName.length; a++) {
			// check if a is an odd number
			if (a % 2 != 0) {
				// get the character and change it to upper case and initialize it to the same
				// index value
				char charnme = charName[a];
				charName[a] = Character.toUpperCase(charnme);
			}
			// print the result
			System.out.print(charName[a]);
		}

	}
}
