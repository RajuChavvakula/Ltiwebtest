package day4;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Scenario 5: Demowebshop.tricentis.com



1. create Register Testcase under @Test, check whether registrtaion is success.
2. create login Test case under @Test, check whether login is success.
3. add @Before for launching browser and open appl
4. add @Test for closeing browser*/

public class Scenario5 {
	WebDriver driver;
	
	@Test
	public void Testcase1() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/label")).click();
		driver.findElement(By.name("FirstName")).sendKeys("kondannaRaju");
		driver.findElement(By.name("LastName")).sendKeys("chavvakula");
		driver.findElement(By.name("Email")).sendKeys("chavaku9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("raju1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("raju1234");
		driver.findElement(By.id("register-button")).click();
		String alreadyexist=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[1]/div/ul/li")).getText();
		assertEquals("The specified email already exists",alreadyexist);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("chavaku9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("raju1234");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String mail=driver.findElement(By.linkText("chavaku9@gmail.com")).getText();
		assertEquals("chavaku9@gmail.com",mail);
		

		
		
		
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
		driver.close();
	}

}
