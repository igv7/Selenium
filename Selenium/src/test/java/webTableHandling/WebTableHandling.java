package webTableHandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	/*
	Practice Exercise 1
	1.	Launch new Browser
	2.	Open URL “http://toolsqa.com/automation-practice-table/”
	3.	Get the value from cell ‘Dubai’ and print it on the console
	4.	Click on the link ‘Detail’ of the first row and last column
	*/

	//Solution
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Igor/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://toolsqa.com/automation-practice-table");
		 
		 //Here we are storing the value from the cell in to the string variable
		 String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		 System.out.println(sCellValue);
		 
		 // Here we are clicking on the link of first row and the last column
		 driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		 System.out.println("Link has been clicked otherwise an exception would have thrown");
		 driver.close();

	}

}
