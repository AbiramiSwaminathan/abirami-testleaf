package week3.day1;

public class Safari extends Browser{
	public void readerMode()
	{
		System.out.println("Reader Mode");
	}
	public void fullScreenMode()
	{
		System.out.println("Full Screen Mode");
	}
	public static void main(String[] args) {
		Safari objSafari = new Safari();
		objSafari.openURL();
		objSafari.fullScreenMode();
		objSafari.readerMode();
		objSafari.closeBrowser();
	}
}
