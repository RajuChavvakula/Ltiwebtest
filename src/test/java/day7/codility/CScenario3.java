package day7.codility;

import org.junit.After;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CScenario3 {
	 WebDriver driver;
		
		@Before
		public void before() {
			//System.out.println("pre-requisite");
			System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/insurance/v1/index.php");
			
			//to maximize the browser
			driver.manage().window().maximize();
		}
		@After
		public void after() {
		//driver.close();
		}
		@Test
		public void TC1() {
			driver.findElement(By.linkText("Register")).click();
			Select designation=new Select(driver.findElement(By.name("title")));
			designation.selectByValue("Mr");
			driver.findElement(By.id("user_firstname")).sendKeys("kondanna raju");
			driver.findElement(By.id("user_surname")).sendKeys("chavvakula");
			driver.findElement(By.id("user_phone")).sendKeys("9606131226");
			Select year=new Select(driver.findElement(By.name("year")));
			year.selectByValue("1995");
			Select month=new Select(driver.findElement(By.id("user_dateofbirth_2i")));
			month.selectByValue("6");
			Select day=new Select(driver.findElement(By.id("user_dateofbirth_3i")));
			day.selectByValue("28");
			driver.findElement(By.name("licencetype")).click();
			Select period=new Select(driver.findElement(By.id("user_licenceperiod")));
			period.selectByValue("1");
			Select occupation=new Select(driver.findElement(By.id("user_occupation_id")));
			occupation.selectByValue("6");
			driver.findElement(By.id("user_address_attributes_street")).sendKeys("melluru");
			driver.findElement(By.id("user_address_attributes_city")).sendKeys("bikkavolu mandalam");
			driver.findElement(By.id("user_address_attributes_county")).sendKeys("india");
			driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("533255");
			driver.findElement(By.name("email")).sendKeys("chavaku9@gmail.com");
			driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("raju1234");
			driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("raju1234");
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.id("email")).sendKeys("chavaku9@gmail.com");
			driver.findElement(By.name("password")).sendKeys("raju1234");
			driver.findElement(By.name("submit")).click();
			WebElement success=driver.findElement(By.xpath("/html/body/div[3]/h4"));
			assertTrue(success.isDisplayed());
			
		}
		

}
