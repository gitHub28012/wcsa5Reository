package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximaize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the webapplication
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/Disabled.html");
		// identify WebElement
		driver.findElement(By.id("i1")).sendKeys("admin");
//		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// generate  alert Pop up 
		jse.executeScript("alert('Hello There!!');");
		
		// To handle Disabled WebElement
		jse.executeScript("document.getElementById('i2').value='manager'");
		
		
		
	}

}
