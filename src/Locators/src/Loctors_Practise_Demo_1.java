
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Loctors_Practise_Demo_1 {
	
	
	public static void main(String [] args) {
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://eventhub.rahulshettyacademy.com/login");
		Driver.findElement(By.id("email")).sendKeys("Aditya.testriq@gmail.com");
		Driver.findElement(By.name("password")).sendKeys("aditya@123");
		Driver.findElement(By.cssSelector("button[id='login-btn']")).click();
		
	}

}
