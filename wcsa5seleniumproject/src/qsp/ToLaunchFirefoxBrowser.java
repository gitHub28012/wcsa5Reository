package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Relative Path of Driver Executable File
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); // Launch Firefox Browser
		
		// maximize the browser
		 driver.manage().window().maximize();
		  
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
