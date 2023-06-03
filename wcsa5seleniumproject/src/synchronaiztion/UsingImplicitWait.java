package synchronaiztion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch Browser

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		

		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin@123");
		
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("idontknow");
		
		driver.findElement(By.cssSelector("button[class*='ap ']")).click();

	}

}
