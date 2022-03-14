package day6.pom.tests;
import org.junit.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class LoginTest {
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
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	@Test
	public void LoginTC(String email,String p) {
		hp.click_login();
		lp.perform_login(email, p);
		if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
			System.out.println("Login Success");
			hp.click_logout();
		}else {
			System.out.println("Login unsuccess");
		}
		
	}
	@DataProvider
	public Object[][] data(){
		new Object[] {"chavaku@gmail.com","raju1234"},
		new Object[] {"mercury",""},
	}

}
