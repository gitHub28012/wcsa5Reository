package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {
	
	// by creating the obj of browser specefic classes
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver cdriver = new ChromeDriver();
		
		
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		cdriver.get("https://www.selenium.dev");
		
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/screenshot3.jpg");
		
		Files.copy(src, dest);
	}

}
