package findElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementCommands1 {
	
	/*
	  Practice Exercise 1
	  1.	Launch new Browser
	  2.	Open URL http://toolsqa.com/automation-practice-form/
	  3.	Type Name & Last Name (Use Name locator)
	  4.	Click on Submit button (Use ID locator)
	 */
		
	//Solution
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

		// Create a new instance of the FireFox driver
		 WebDriver driver = new FirefoxDriver();
		 
		 // Launch the ToolsQA WebSite
		 driver.get("http://toolsqa.com/Automation-practice-form/");
		 
		 // Type Name in the FirstName text box      
		 driver.findElement(By.name("firstname")).sendKeys("Lakshay"); 
		 
		 //Type LastName in the LastName text box
		 driver.findElement(By.name("lastname")).sendKeys("Sharma");
		 
		 // Click on the Submit button
		 driver.findElement(By.id("submit")).click();

	}

}
