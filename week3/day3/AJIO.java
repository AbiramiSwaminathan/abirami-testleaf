package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIO {
public static void main(String[] args) {
	
	//create object for chromedriver and launch the given URL
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/");
	
	driver.findElement(By.name("searchVal")).sendKeys("bags");
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
}
}