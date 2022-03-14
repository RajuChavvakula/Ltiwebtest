package day7.codility;
import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.*;--for By,WebElement,WebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class scenario1 {
        WebDriver driver;
	
		@Before
		public void before() {
			//System.out.println("pre-requisite");
			System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			//to maximize the browser
			driver.manage().window().maximize();
		}
		@After
		public void after() {
		driver.close();
		}
		@Test
		public void TC1() {
			
			WebElement searchbox=driver.findElement(By.name("q"));
			WebElement searchbtn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
			assertTrue(searchbox.isDisplayed());
			assertTrue(searchbtn.isDisplayed());
		}
		@Test()
		public void TC2() {
			
			driver.findElement(By.name("q")).sendKeys("testing");
			int list=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li")).size();
			assertTrue(list>1);
			//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li
			//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span
			//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]
			//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]
					//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]
		}
		@Test
		public void TC3() {
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
			
			assertTrue(driver.getTitle().contains("Google"));
			
		}
		@Test
		public void TC4() {
			int links=driver.findElements(By.tagName("a")).size();
			assertTrue(links>=1);
		}
		

	

}
