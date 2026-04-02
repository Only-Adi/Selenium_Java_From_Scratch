import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Advanced_Locators_Session_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		
		
		// Page 1
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement username = Driver.findElement(By.id("inputUsername")); 
		username.sendKeys("Adixtest");
		WebElement password = Driver.findElement(By.cssSelector("input[placeholder='Password']"));
		password.sendKeys("!test@123?");
		WebElement SignIn = Driver.findElement(By.cssSelector("button[type='submit']"));
		SignIn.click();
		
		String Waitmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error"))).getText();
		System.out.println("The Error msg is " + Waitmsg); 
		
		
		WebElement ForgotPassword = Driver.findElement(By.linkText("Forgot your password?"));
		ForgotPassword.click(); 
		
		
		// Page 2 
		
		WebElement Name = Driver.findElement(By.cssSelector("input[placeholder='Name']"));
		Name.sendKeys("Aditya Vshk");
		
		WebElement Password = Driver.findElement(By.cssSelector("input[placeholder='Email']"));
		Password.sendKeys("!Test@123?"); 
		
		WebElement Number = Driver.findElement(By.cssSelector("input[placeholder='Phone Number']"));
		Number.sendKeys("9920149102"); 
		
	    WebElement WaitButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("reset-pwd-btn")));
	    WaitButton.click(); 
	    
	    String TempPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("infoMsg"))).getText();
		System.out.println("The Error msg is " + TempPassword); 
		
		 WebElement WaitButtonLogin = wait.until(ExpectedConditions.elementToBeClickable(By.className("go-to-login-btn")));
		 WaitButtonLogin.click(); 
		 
		
		 
		 username.sendKeys("Tony Stark");
		 password.sendKeys("rahulshettyacademy");
		 
		 WebElement rememberMyUsername = Driver.findElement(By.id("chkboxOne"));
		 rememberMyUsername.click();
		 
		 SignIn.click();
		 
		 
		 
	    
	    
	    
	    
//		WebElement ResetLogin = Driver.findElement(By.className(".reset-pwd-btn"));
//		ResetLogin.click();
		
		
		

	}

}
