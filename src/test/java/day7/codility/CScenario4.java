package day7.codility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CScenario4 {
	WebDriver driver;
	
	@Before
	public void before() {
		//System.out.println("pre-requisite");
		System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://jmeter.apache.org/");
		
		//to maximize the browser
		driver.manage().window().maximize();
	}
	@After
	public void after() {
	driver.close();
	}
	@Test
	public void tc() {
		int links=driver.findElements(By.tagName("a")).size();
		if(links>=1) {
			System.out.println("the n.o of links on the webpage are:"+links);
		}else {
			System.out.println("there are no links present on the webpage");
		}
	}
}
