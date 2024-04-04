package week3.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseList {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
		
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			
		}
	}

}
