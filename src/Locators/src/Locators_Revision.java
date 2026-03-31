import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Locators_Revision {
	
	public static void main(String [] args) {
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://eventhub.rahulshettyacademy.com/login");

		Driver.findElement(By.id("email")).sendKeys("aditya.testriq@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("!Test@123?");
		Driver.findElement(By.id("login-btn")).click();

		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));

		String message = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.cssSelector(".relative.overflow-hidden.flex.items-start.gap-3.p-4.pr-8")
		    )
		).getText();

		System.out.println(message);
		
	}

}
