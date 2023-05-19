package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		// to click on Sign Up Link
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(4000);
		// To send the inputs for full name textBox
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("Tanmay");
		Thread.sleep(2000);
		//To send the inputs for email textBox
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("tanmay@123");
		
	}

}
