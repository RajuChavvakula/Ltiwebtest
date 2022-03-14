package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch chrome browser
				System.setProperty("webdriver.chrome.driver","D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				//Open Application
				driver.get("http://demowebshop.tricentis.com/");
				
				//To maximize the page
				driver.manage().window().maximize();
				
				//Click on Login
				driver.findElement(By.linkText("Log in")).click();
				//Enter email
				driver.findElement(By.name("Email")).sendKeys("chavaku9@gmail.com");
				
				//Enter Password
				driver.findElement(By.name("Password")).sendKeys("raju1234");
				
				//Click on Remember Button
				driver.findElement(By.xpath("//input[@value='true']")).click();
				
				//Click on Login
				//driver.findElement(By.name("submit")).click();	
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				
				//Type "Build your own cheap computer" in searchbox
				driver.findElement(By.name("q")).sendKeys("Build your own cheap computer");
				
				//SearchBox
				driver.findElement(By.xpath("//input[@value='Search']")).click();
				
				//Displaying Detials
				driver.findElement(By.linkText("Build your own cheap computer")).click();
				
				//Click Fast processor
				driver.findElement(By.id("product_attribute_72_5_18_65")).click();
				
				// Click 8 GM RAM
				driver.findElement(By.id("product_attribute_72_6_19_91")).click();
				
				// Click 400 GB HDD
				driver.findElement(By.id("product_attribute_72_3_20_58")).click();
				
				// Check Image Viever, Office suite, Other office suite
				driver.findElement(By.id("product_attribute_72_8_30_93")).click();
				driver.findElement(By.id("product_attribute_72_8_30_94")).click();
				driver.findElement(By.id("product_attribute_72_8_30_95")).click();
				
				// Click add to cart
				driver.findElement(By.id("add-to-cart-button-72")).click();
				driver.findElement(By.linkText("Shopping cart")).click();
				
				
				

			}

		

	}


