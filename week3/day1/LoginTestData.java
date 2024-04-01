package week3.day1;

//Create a SubClass by using extends keyword and inherit the SuperClass
public class LoginTestData extends TestData {
	// Implement two methods with messages to print
	public void enterUsername() {
		System.out.println("Enter User Name");
	}

	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		// Create Object for this SubClass and call all the methods from this class and
		// its Super class.
		LoginTestData objLoginTestData = new LoginTestData();

		objLoginTestData.enterCredentials();
		objLoginTestData.enterUsername();
		objLoginTestData.enterPassword();
		objLoginTestData.navigateToHomePage();
	}
}
