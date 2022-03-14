package webdrivertestday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//handle alert with ok
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//handle confirm box
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		
		//handle prompt box
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.id("Textbox")).click();
		Thread.sleep(5000);
		
		//read alert
		String text=driver.switchTo().alert().getText();
		if(text.contains("Please enter your name")) {
			driver.switchTo().alert().sendKeys("raju chavvakula");
			driver.switchTo().alert().accept();
		}

	}

}
