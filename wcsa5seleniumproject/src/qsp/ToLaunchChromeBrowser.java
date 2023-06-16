package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	      WebDriverManager.chromedriver().setup();
		// upcast into WebDriver (I)
		  WebDriver driver=new ChromeDriver(); // Launch Chrome Browser
		  
		// maximize the browser
		 driver.manage().window().maximize();
		  
		  
		  // provide the dealy of 2 sec 
		  Thread.sleep(2000); // stop exe for 2 sec
		  
		  // To close browser
		  driver.close();

	}

}
