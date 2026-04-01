import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Last_Revision_Session {
	
	
	

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		
		WebDriver Driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(5));
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys("Aditya_Vshk");
		Driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("!Qwer@123?");
		
		Driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
//		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form p"))).getText(); // using css selector
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error"))).getText();
		System.out.println(message);
		
		Driver.findElement(By.linkText("Forgot your password?")).click();
		
		Driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Saskia");
		Driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("adityavshk008@gmail.com");
		Driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9820986108");
//		Driver.findElement(By.className("go-to-login-btn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("go-to-login-btn"))).click();
}

}
