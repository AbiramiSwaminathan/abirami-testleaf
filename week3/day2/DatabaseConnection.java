package week3.day2;

//Create an interface and add unimplemented methods
public interface DatabaseConnection {
	public void connect();

	public void executeUpdate();

	public void disconnect();
}
