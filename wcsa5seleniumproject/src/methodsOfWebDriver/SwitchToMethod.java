package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);

		//To perform back operation
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}

}
