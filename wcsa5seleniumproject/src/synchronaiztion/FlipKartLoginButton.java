package synchronaiztion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLoginButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch Browser
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com"); // flipkart WebApplication
		
		driver.findElement(By.xpath("//button[text()='✕']")).click(); // handle pop up
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();// click on cart
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Login']")).click(); // click on login button
	}

}
