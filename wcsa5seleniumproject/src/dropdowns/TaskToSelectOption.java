package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Single Select DropDown
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsa5/WebElement/SingleSelectDropdown.html");
		
		//identify dropDown on webpage
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		// handle the dropDown by createing obj of Select...
		 Select sel = new Select(dropDownElement);
		 
		 // read all the options of dropdown
		 List<WebElement> allOps = sel.getOptions();
		 //To read List use looping statments
		 for(WebElement op:allOps)
		 {
			 if(op.getText().equals("Pav Bhaji"))
			 {
				 Thread.sleep(2000);
				 op.click();
				 break;
			 }
		 }
		 
	}

}
