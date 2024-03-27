package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
	public static void main(String[] args) {
		//initialize object for ChromeDriver class
		ChromeDriver mydriver = new ChromeDriver();
		//Maximize the window
		mydriver.manage().window().maximize();
		//Launch Facebook URL
		mydriver.get("https://www.facebook.com/");
		//mydriver.findElement(By.className("_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy")).click();
		//find  the element and enter user name value
		mydriver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//find the element and enter password value
		mydriver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//find the element and click on Login Button
		mydriver.findElement(By.name("login")).click();
		
		//find the element and click on the Link to find the account
		mydriver.findElement(By.linkText("Find your account and log in.")).click();
		
		// find the locator and get the page header to display
		
		
		  String pageHeader = mydriver.getTitle();
		  //Print the page header
		  System.out.println("The Page that we have landed is : " + pageHeader);
		 
		 
		
	}
	

}
