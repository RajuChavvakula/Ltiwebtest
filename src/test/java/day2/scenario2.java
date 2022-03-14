package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scenario2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("rajuchavvakula");
		driver.findElement(By.name("password")).sendKeys("raju12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		// create xpath
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//select passenger value from dropdown
		Select p=new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		//p.selectByValue("4");
		//p.selectByVisibleText("4");
		
		Select d=new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("New York");
		Select e=new Select(driver.findElement(By.name("fromMonth")));
		e.selectByValue("6");
		Select f=new Select(driver.findElement(By.name("fromDay")));
		f.selectByValue("28");
		Select g=new Select(driver.findElement(By.name("toPort")));
		g.selectByValue("London");
		Select h=new Select(driver.findElement(By.name("toMonth")));
		h.selectByValue("12");
		Select i=new Select(driver.findElement(By.name("toDay")));
		i.selectByValue("28");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select x=new Select(driver.findElement(By.name("airline")));
		x.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		
		
		

	}

}
