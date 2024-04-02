package week3.day2;

public class MethodOverloading {
//Create two methods with same name but different set of arguments
	public void reportStep(String msg, String status) {

		System.out.println("The message is : " + msg);
		System.out.println("The Status is : " + status);
	}

	public void reportStep(String msg, String status, Boolean snap) {
		System.out.println("The message is : " + msg);
		System.out.println("The Status is : " + status);
		if (snap == true)
			System.out.println("You can take the screenshot now");
		else
			System.out.println("You cannot take the screenshot now");
	}

	public static void main(String[] args) {
		// Create Object for the class and call the method with giving respective
		// argument values
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.reportStep("1st Method", "It has 2 Arguments");
		objMethodOverloading.reportStep("2nd Method", "It has 3 Arguments", true);
	}
}
