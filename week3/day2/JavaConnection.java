package week3.day2;

//Create a class and implement the interface methods
public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Database Connected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update Executed");
	}

	@Override
	public void disconnect() {
		System.out.println("Database Disconnected");
	}

	public static void main(String[] args) {
		// Create object for this class and call all the methods
		JavaConnection objJavaConnection = new JavaConnection();
		objJavaConnection.connect();
		objJavaConnection.executeUpdate();
		objJavaConnection.disconnect();
	}

}
