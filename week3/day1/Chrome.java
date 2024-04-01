package week3.day1;

public class Chrome extends Browser {
public void openIncognito()
{
	System.out.println("Open in Incognito");
	}
public void clearCache()
{
	System.out.println("Clear the Cache");
	}
public static void main(String[] args) {
	Chrome objChrome = new Chrome();
	objChrome.openIncognito();
	objChrome.clearCache();
	objChrome.closeBrowser();
}
}
