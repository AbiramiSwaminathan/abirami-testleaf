package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLeaftapsApplication {
	public static void main(String[] args) {
		// initialize object for launching the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// give the page url that we have to open
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// find the locator for uername and send input values
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// find the locator for password and send input values
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// find the locator for Submit button and click on the button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// find the locator and get the page header to display
		String pageHeader = driver.findElement(By.tagName("h2")).getText();
		// Print the page header
		System.out.println("The Page that we have landed is : " + pageHeader);
		
		// find the element to click on the link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// find the element to click on the link
		driver.findElement(By.linkText("Leads")).click();
		// find the element to click on the link using PartialLink
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		// find the element and fill the data for Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company Name");
		// find the element and fill the data for First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		// find the element and fill the data for Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		
		// find the element and clcik on the Create Lead Button
		driver.findElement(By.name("submitButton")).click();

	}
}
