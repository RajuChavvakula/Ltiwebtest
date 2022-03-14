package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
//import org.testng.annotations.Test;
/*1. find number of links available on demowebshop
2. fetch number of broken links/images from demowebshop*/

public class Readdatafromexcel {
	static WebDriver driver;
  @Test
  public void LoginTc1() throws IOException,InterruptedException {
	  //Read data from excel
	  //C:\\data\\LoginData.xlsx
	  FileInputStream fis=new FileInputStream(new File("D:\\LTI TRAINING\\selenium\\data\\LoginData.xlsx"));
	  //access work-book XSS work book class
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  //access work sheet
	  XSSFSheet sh=wb.getSheet("Sheet1");
	  //access cell data
	  System.out.println("n.o of rows is: "+sh.getPhysicalNumberOfRows());
	  for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
		  String username=sh.getRow(i).getCell(0).getStringCellValue();
		  String psd=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(username+"---"+psd);
		  driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(psd);
			driver.findElement(By.name("submit")).click();
			if(driver.getTitle().contains("Login")) {
				System.out.println("valid credentials");
				driver.findElement(By.linkText("SIGN-OFF")).click();
			}else {
				System.out.println("invalid credetials");
			}
		  
	  }
	  
	  
  }
  @SuppressWarnings("deprecation")
@BeforeClass
  public static void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//to maximize the browser
		driver.manage().window().maximize();
  }
  @AfterClass
  public static void afteraclass() {
	  driver.close();
  }
}
