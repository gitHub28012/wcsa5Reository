package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Relative Path of Driver Executable File
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
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
