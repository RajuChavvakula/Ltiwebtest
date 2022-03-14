package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGExercise2 {
	WebDriver driver;
  @Test(priority=1)
  public void logintc() {
	  driver.findElement(By.name("userName")).sendKeys("rajuchavvakula");
		driver.findElement(By.name("password")).sendKeys("raju12345");
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority=2,enabled=false)
  public void flightsearchtc() throws InterruptedException {
	  driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
  }
  
  
 /* public void f() {
  }*/
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//to maximize the browser
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
