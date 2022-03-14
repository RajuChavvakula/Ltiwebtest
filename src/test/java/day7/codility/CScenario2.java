package day7.codility;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CScenario2 {
	WebDriver driver;
	
	@Before
	public void before() {
		//System.out.println("pre-requisite");
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		
		//to maximize the browser
		driver.manage().window().maximize();
	}
	@After
	public void after() {
	driver.close();
	}
	@Test
	public void TC1() {
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void TC2() throws InterruptedException {
		/*driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		//Select drop=new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")));
		Select drop1=new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")));
	     drop1.selectByVisibleText("3309");
	     driver.findElement(By.name("AccSubmit")).click();*/
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		Thread.sleep(5000);
		Select drop1=new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")));
	    drop1.selectByVisibleText("3309");
	    driver.findElement(By.name("AccSubmit"));
	}
	@Test
	public void TC3() {
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		String title=driver.getTitle();
		System.out.println(title);
		assertEquals("Guru99 Bank Customer HomePage",title);
		
	}
	@Test
	public void TC4() throws InterruptedException {
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		Thread.sleep(5000);
		String home=driver.findElement(By.linkText("Home")).getText();
		assertEquals("Home",home);
	}

}
