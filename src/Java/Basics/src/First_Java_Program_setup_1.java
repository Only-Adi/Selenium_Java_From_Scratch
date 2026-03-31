import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 1_First_Java_Program_setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "1";
		System.out.println(a);
	
		int b = 2;
		System.out.println(b); 
		
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://35.154.4.154/medirect_admin/"); 
		
		String Value = Driver.getTitle();
		System.out.println(Value);
		
		
		
		
	}

}
