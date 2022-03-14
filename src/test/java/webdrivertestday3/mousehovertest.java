package webdrivertestday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovertest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LTI TRAINING\\installations\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement computers=driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a"));
		WebElement accessories=driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(computers).moveToElement(accessories).click().build().perform();

	}

}
