package navigateCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";

		driver.get(appUrl);

// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

// Go back to Home Page
		driver.navigate().back();

// Go forward to Registration page
		driver.navigate().forward();

// Go back to Home page
		driver.navigate().to(appUrl);

// Refresh browser
		driver.navigate().refresh();

// Close browser
		driver.close();

	}

}
