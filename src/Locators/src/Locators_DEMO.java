import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_DEMO {

	
	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		
		
		// Navigate the website
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
	   // i Will search for the locators using inspect method on the above website 
		Driver.findElement(By.id("inputUsername")).sendKeys("aditya");	
		Driver.findElement(By.name("inputPassword")).sendKeys("!Test@123?");
		Driver.findElement(By.className("signInBtn")).click();
		
	}
}
