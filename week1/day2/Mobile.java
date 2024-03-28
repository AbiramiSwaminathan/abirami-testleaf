package week1.day2;

public class Mobile {
	public void makeCall() {
		String mobileModel ="Samsung";
		float mobileWeight = 10.55f;
		System.out.println("Mobile Model : " + mobileModel);
		System.out.println("Mobile Weight : " + mobileWeight);
	}
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost = 15000;
		System.out.println("Is Fully Charged : " + isFullyCharged);
		System.out.println("Price : " + mobileCost);
	}
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println("This is my mobile");
	}
}
