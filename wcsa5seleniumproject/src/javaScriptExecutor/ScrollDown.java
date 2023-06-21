package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// launch the browser
		WebDriver driver=new ChromeDriver();
		// maximaize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the webapplication
		driver.get("https://www.selenium.dev/");
		//To perform scrolling Opertaions 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		// scroll Down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		WebElement buttonReadMore = driver.findElement(By.xpath("//a[contains(@class,'selenium-id')]"));
		
		jse.executeScript("arguments[0].click();",buttonReadMore);
	}

}
