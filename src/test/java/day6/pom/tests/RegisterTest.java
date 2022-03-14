package day6.pom.tests;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class RegisterTest {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	static HomePageClass hp;
	static RegisterPageClass rp;
	static LoginPageClass lp;
	@BeforeClass
	public static void beforeclass() throws IOException {
		//create an object for properties class
				fis=new FileInputStream(new File("C:\\Users\\ch.k.raju\\eclipse-workspace\\LTIWebDriverTest\\config.properties"));
				prop=new Properties();
				prop.load(fis);
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				//open application
				driver.get("http://demowebshop.tricentis.com/");
				//create object for homepageclass and registerpageclass
				hp=new HomePageClass(driver);
				rp=new RegisterPageClass(driver);
				lp=PageFactory.initElements(driver, LoginPageClass.class);
	}
	@AfterClass
	public static void afterclass() {
		//driver.close();
		
	}
	@Test ()
	public void registertest() {
		hp.click_register();
		rp.perform_register_male("raju", "chavvakula", "chavaku@gmail.com", "raju1234", "raju1234");
		//String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
		//assertTrue(text.contains("completed"));
		//driver.findElement(By.linkText("Log out")).click();
		
	}
	@Test
	public void LoginTC() {
		hp.click_login();
		lp.perform_login("chavaku@gmail.com","raju1234");
		String text=driver.findElement(By.linkText("chavaku@gmail.com")).getText();
		assertTrue(text.contains("chavaku@gmail.com"));
	}

}
