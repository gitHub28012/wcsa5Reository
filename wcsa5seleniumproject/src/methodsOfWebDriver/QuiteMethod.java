package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// click on link for the child browser
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		// close parent as well as child browser
		driver.quit();	


	}

}
