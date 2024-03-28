package week1.day2;

public class Laptop {
	public void SwitchOn() {
		System.out.println("Laptop Switched On");
	}
	public void openDocuments() {
		System.out.println("Documents Opened");
	}
	public void editDocuments() {
		System.out.println("Documents Editing");
	}
	public void closeDocuments() {
		System.out.println("Documents Closed");
	}
	public void playVideos() {
		System.out.println("Videos Playing");
	}
	public void playMusic() {
		System.out.println("Music Playing");
	}
	public void switchOff() {
		System.out.println("Laptop Switched Off");
	}
	
	public static void main(String[] args) {
		Laptop myLaptop = new Laptop();
		myLaptop.SwitchOn();
		myLaptop.openDocuments();
		myLaptop.editDocuments();
		myLaptop.closeDocuments();
		myLaptop.playVideos();
		myLaptop.playMusic();
		myLaptop.switchOff();
	}
}
