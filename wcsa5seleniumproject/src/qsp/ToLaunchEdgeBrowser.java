package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
	    WebDriver driver=new EdgeDriver(); //  use to launch Edge Browser.
	    
		// maximize the browser
		 driver.manage().window().maximize();
		  
	    
	    Thread.sleep(2000);
	    driver.close();
	}

}
