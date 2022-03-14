package day5;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitexercise2 {
	WebDriver driver;
	
	@Test
	public void TestCase1() {
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		Assert.assertTrue(registerlink.isDisplayed());
		Assert.assertTrue(loginlink.isDisplayed());
		
	}
	@Test
	public void TestCase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("chavaku9@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("raju1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//verify login successs
		String emailtext=driver.findElement(By.linkText("chavaku9@gmail.com")).getText();
		assertTrue(emailtext.contains("chavaku9"));
		assertEquals("chavaku9@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("chavaku9@gmail.com")).isEnabled());
		
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
	}
	@After
	public void after() {
		
	}

}
