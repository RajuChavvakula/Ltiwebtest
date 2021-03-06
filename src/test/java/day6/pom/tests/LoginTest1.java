package day6.pom.tests;

import org.testng.annotations.Test;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class LoginTest1 {
	 WebDriver driver;
	 FileInputStream fis;
	 Properties prop;
	 HomePageClass hp;
	 RegisterPageClass rp;
	 LoginPageClass lp;
  @Test(dataProvider="data")
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
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "chavaku@gmail.com", "raju1234" },
      new Object[] { "mercury", "m" },
    };
  }
  @BeforeClass
  public void beforeClass() throws IOException {
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
  public void afterClass() {
	  driver.close();
  }

}
