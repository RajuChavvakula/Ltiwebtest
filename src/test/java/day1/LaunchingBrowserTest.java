package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\LTI TRAINING\\installations\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//close browser
		//driver.close();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		
		//enter user name as rajuchavvakula
		driver.findElement(By.name("email")).sendKeys("rajuchavvakula");
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("raju12345");
		
		//enter confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("raju12345");
		
		//click on submit
		driver.findElement(By.name("submit")).click();
		
		//close window
		driver.close();

	}

}
