package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {
	
	/*
	Practice Exercise – 1
	1.	Launch a new Firefox browser.
	2.	Open Shop.DemoQA.com
	3.	Get Page Title name and Title length
	4.	Print Page Title and Title length on the Eclipse Console.
	5.	Get Page URL and verify if it is a correct page opened
	6.	Get Page Source (HTML Source code) and Page Source length
	7.	Print Page Length on Eclipse Console.
	8.	Close the Browser.
	*/
	
	//Solution
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

// Storing the Application Url in the String variable
		String url = "http://www.store.demoqa.com";

//Launch the ToolsQA WebSite
		driver.get(url);

// Storing Title name in the String variable
		String title = driver.getTitle();

// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();

// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title);
		System.out.println("Length of the title is : " + titleLength);

// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened.");

		} else {

			System.out.println("Verification Failed - An incorrect Url is opened.");

//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);

		}

// Storing Page Source in String variable
		String pageSource = driver.getPageSource();

// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();

// Printing length of the Page Source on console
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength);

//Closing browser
		driver.close();

	}

}
