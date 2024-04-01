package week3.day1;

//Inherit the Super Class by using extends keyword
public class TextField extends WebElement {
	// Implement a method to print the appropriate value and return the string
	public String getText() {
		System.out.println("Get the text value");
		return "TextField";
	}
}
