package week3.day1;

public class Edge extends Browser{
	public void takeSnap()
	{
	System.out.println("Take a Snap");	
	}
	public void clearCookies()
	{
		System.out.println("Clear Cookies");
	}
	public static void main(String[] args) {
		Edge objEdge = new Edge();
		objEdge.openURL();
		objEdge.takeSnap();
		objEdge.clearCookies();
		objEdge.closeBrowser();
	}
}
