package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximaize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the webapplication
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		// To perform scrolling operations
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		// Scroll Right
		jse.executeScript("window.scrollBy(5000,0)");
	}

}
