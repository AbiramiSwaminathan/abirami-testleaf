package week3.day1;

public class Browser {
	String browserVersion="12.5.3.01";
	String browserName="BrowserName";
	public void openURL()
	{
		System.out.println("Open the Browser : " + browserName);
	}
	public void closeBrowser()
	{
		System.out.println("Close the Browser : " + browserName);
	}
	public void navigateBack()
	{
		System.out.println("Going back");
	}
public static void main(String[] args) {

	Browser objBrowser = new Browser();
	objBrowser.openURL();
	objBrowser.closeBrowser();
	objBrowser.navigateBack();
}
}
