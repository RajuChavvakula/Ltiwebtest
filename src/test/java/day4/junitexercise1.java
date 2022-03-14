package day4;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitexercise1 {
	WebDriver driver;
	
	
	@Test
	public void Testcase1() {
	
		//System.out.println("Test case 1");
		driver.findElement(By.name("userName")).sendKeys("rajuchavvakula");
		driver.findElement(By.name("password")).sendKeys("raju12345");
		driver.findElement(By.name("submit")).click();
		//check whether login is success
		String actualresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully", actualresult);
	}
	
	@Test
	public void Testcase2() throws InterruptedException {
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//check wehther title of webpage is Find a Flight: Mercury Tours: 
		String title=driver.getTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		
	}

	@Before
	public void before() {
		//System.out.println("pre-requisite");
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//to maximize the browser
		driver.manage().window().maximize();
	}
	
	@After
	public void after() {
		//System.out.println("PostCondition");
		//driver.close();
	}
}
