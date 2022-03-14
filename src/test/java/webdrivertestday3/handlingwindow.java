package webdrivertestday3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		//get window id
		String oldpage=driver.getWindowHandle();
		System.out.println("current opened page window id is :" + oldpage);
		//click on click here link
		driver.findElement(By.linkText("Click Here")).click();
		//switch from old window to new window
		//to get the window id of newly opened tab, use below syntax
		Set <String> newpage=driver.getWindowHandles();
		for(String name:newpage) {
			driver.switchTo().window(name);
			System.out.println("window id of newly opened tab is :" + name);
		}
		//enter email id
		driver.findElement(By.name("emailid")).sendKeys("chavaku9@gmail.com");
		//click on submit
		driver.findElement(By.name("btnLogin")).click();
		//switch from newpage to oldpage
		driver.switchTo().window(oldpage);
		//driver.close();----->close only active tab
		driver.quit();

	}

}
