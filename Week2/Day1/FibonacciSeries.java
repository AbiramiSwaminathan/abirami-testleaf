package week2.day1;

public class FibonacciSeries {
	public static void main(String[] args) {

//declare and initailize 3 integers for count, 0 and 1 respectively
		int count = 8;
		int a = 0;
		int b = 1;
		// print first 2 numbers with heading
		System.out.println("Fibonacci Series with Count 8:");
		System.out.print(a + ", " + b);
		// declare a for loop and iterate add the numbers till the count
		for (int i = 2; i < count; i++) {
			int c = a + b;
			System.out.print(c + ", ");
			a = b;
			b = c;
		}
	}
}
