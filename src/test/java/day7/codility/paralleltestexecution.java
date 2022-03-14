package day7.codility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class paralleltestexecution {
	System.setProperty("webdriver.chrome.driver", "D:\\LTI TRAINING\\installations\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	//open application
	driver.get("http://demowebshop.tricentis.com/");
}
