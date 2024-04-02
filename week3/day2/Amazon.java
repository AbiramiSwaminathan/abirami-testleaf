package week3.day2;

//Create a class and inherit the abstract class using extends keyword
public class Amazon extends CanaraBank {
//All the unimplemented method from the interface are implemented here
	@Override
	public void cashOnDelivery() {
		System.out.println("This method iimplemented from an Interface - This is will show Cash on Delivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("This method iimplemented from an Interface - This is will show UPI Payments");
	}

	@Override
	public void cardPayments() {
		System.out.println("This method iimplemented from an Interface - This is will show Card Payments");
	}

	@Override
	public void internetBanking() {
		System.out.println("This method iimplemented from an Interface - This is will show Internet Banking");
	}

//The unimplemented abstract method is also implemented here
	@Override
	public void recordPaymentDetails() {
		System.out.println("This method is from the Abstract Class - This is will show Payment Record Details");
	}

	public static void main(String[] args) {
		// Create an object for this class and call all the methods
		Amazon objAmazon = new Amazon();
		objAmazon.cashOnDelivery();
		objAmazon.upiPayments();
		objAmazon.cardPayments();
		objAmazon.internetBanking();
		objAmazon.recordPaymentDetails();
	}

}
