package week2.day2;

public class PrintReverse {
	public static void main(String[] args) {
		// declare and initilize name in string
		String name = "Abirami";
		// change the string value into char array
		char[] arrayName = name.toCharArray();
		System.out.println("Name in Reverse : ");
		// iterate all the characters in the array in reverse order and print the output
		for (int i = arrayName.length - 1; i >= 0; i--) {

			System.out.print(arrayName[i]);
		}
	}
}
