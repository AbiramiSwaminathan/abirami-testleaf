package week3.day2;

//Create a class and write methods with same name but different arguments
public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("This is printed from the method that has 1 argument");
		System.out.println("The value for the endpoint is : " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("");
		System.out.println("This is printed from the method that has 3 argument");
		if (requestStatus) {
			System.out.println("The value for the endpoint is : " + endpoint);
			System.out.println("The value for the body is : " + requestBody);
			System.out.println("The request is successful");
		} else {
			System.out.println("The value for the endpoint is : " + endpoint);
			System.out.println("The value for the body is : " + requestBody);
			System.out.println("The request is unsuccessful");
		}
	}

	public static void main(String[] args) {
		// Create object for this class and call both the methods using appropriate
		// arguments
		APIClient objAPIClient = new APIClient();
		objAPIClient.sendRequest("Sample End Point");
		objAPIClient.sendRequest("Sample End Point", "Sample Body", true);
	}
}
