package dropDownCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectCommands {
	/*
	Practice Exercise -2 (Multiple Selection Box/List)
	1.	Launch new Browser
	2.	Open “http://toolsqa.com/automation-practice-form/”
	3.	Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
	4.	Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
	5.	Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
	6.	Print and select all the options for the selected Multiple selection list.
	7.	Deselect all options
	8.	Close the browser
	*/
	
	// Solution
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// Put an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://toolsqa.com/automation-practice-form");

		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to
		// identify the element )
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));

		// Step 4: Select option 'Browser Commands' and then deselect it (Use
		// selectByIndex and deselectByIndex)
		oSelect.selectByIndex(0);
		Thread.sleep(2000);
		oSelect.deselectByIndex(0);

		// Step 5: Select option 'Navigation Commands' and then deselect it (Use
		// selectByVisibleText and deselectByVisibleText)
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oSelect.deselectByVisibleText("Navigation Commands");

		// Step 6: Print and select all the options for the selected Multiple selection
		// list.
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();

		// Setting up the loop to print all the options
		for (int i = 0; i < iListSize; i++) {
			// Storing the value of the option
			String sValue = oSelect.getOptions().get(i).getText();

			// Printing the stored value
			System.out.println(sValue);

			// Selecting all the elements one by one
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
		}

		// Step 7: Deselect all
		oSelect.deselectAll();

		// Kill the browser
		driver.close();

	}

}
