package week3.day3;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Languages {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> lstLang = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(WebElement lang : lstLang)
		{
			System.out.println(lang.getText());
		}
	}
	
}
