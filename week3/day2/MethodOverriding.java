package week3.day2;
//Inherit Parent Class using extends keyword
public class MethodOverriding extends SuperClass{
//Create methods of the same name from Parent Class to demonstrate method Overriding
	public void checkClass()
	{
		System.out.println("This is from Sub Class Overriding the Super Class method");
	}
	public void subClassMethod()
	{
		System.out.println("Sub Class Method");
	}
	public static void main(String[] args) {
		//Create object for the class and call all the methods from this class and its super class
		MethodOverriding objMethodOverriding = new MethodOverriding();
		objMethodOverriding.checkClass();
		objMethodOverriding.common();
		objMethodOverriding.subClassMethod();
	}
}
