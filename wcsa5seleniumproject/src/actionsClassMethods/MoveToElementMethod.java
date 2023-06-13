package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveToElementMethod {
	
	// use to perform mouseHover action
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application.
		
		driver.findElement(By.id("denyBtn")).click(); // handle the popup.
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Watch')]")).click();
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		
		// to perform mouse actions on webelement..
		     Actions act = new Actions(driver);
		   
		    // to perform mouseHover action
		     
		     act.moveToElement(target).perform();
		     
		     driver.findElement(By.xpath("//a[.='Band']")).click();
//		     
	}

}
