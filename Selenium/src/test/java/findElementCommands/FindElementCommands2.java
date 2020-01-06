package findElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementCommands2 {
	
	/*
	Practice Exercise 2
	1.	Launch new Browser
	2.	Open URL http://toolsqa.com/automation-practice-form/
	3.	Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
	4.	Identify Submit button with ‘tagName’, convert it into a string and print it on the console
	5.	Click on the Link “Link Test” (Use ‘linkTest’ locator)
	*/
	
	//Solution
	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		
		// Create a new instance of the FireFox driver
		 WebDriver driver = new FirefoxDriver();
		 
		 // Launch the Online Store WebSite
		 driver.get("http://toolsqa.com/Automation-practice-form/");
		 
		 // Click on "Partial Link Text" link
		 driver.findElement(By.partialLinkText("Partial")).click();
		 System.out.println("Partial Link Test Pass");
		 
		 // Convert element in to a string 
		 String sClass = driver.findElements(By.tagName("button")).toString();
		 System.out.println(sClass);
		 
		 // Click on "Link Text" link
		 driver.findElement(By.linkText("Link Test")).click();
		 System.out.println("Link Test Pass");

	}

}
