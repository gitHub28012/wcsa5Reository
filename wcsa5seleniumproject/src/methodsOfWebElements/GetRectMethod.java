package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.selenium.dev/");

		Rectangle newsElement = driver.findElement(By.xpath("//h2[.='News']")).getRect();
		
		int xaxis = newsElement.getX();
		int yaxis = newsElement.getY();
		
		int height = newsElement.getHeight();
		int width = newsElement.getWidth();
		
		
		System.out.println(xaxis+" "+yaxis+" "+height+" "+width);
	}

}
