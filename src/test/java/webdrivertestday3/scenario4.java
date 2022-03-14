package webdrivertestday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LTI TRAINING\\installations\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//WebElement src=driver.findElement(By.xpath("//div[@id='product']/div/ul/li[2]"));
		WebElement src=driver.findElement(By.id("fourth"));
		WebElement target=driver.findElement(By.id("amt7"));
		act.dragAndDrop(src, target)
		.build().perform();
		WebElement src1=driver.findElement(By.id("credit2"));
		WebElement target1=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		act.dragAndDrop(src1, target1)
		.build().perform();
		WebElement src2=driver.findElement(By.id("credit1"));
		WebElement target2=driver.findElement(By.id("loan"));
		act.dragAndDrop(src2, target2)
		.build().perform();
		WebElement src3=driver.findElement(By.id("fourth"));
		WebElement target3=driver.findElement(By.id("amt8"));
		act.dragAndDrop(src3, target3)
		.build().perform();
		
		
		/*System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act= new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("credit2")),
		driver.findElement(By.id("bank"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("fourth")), 
		driver.findElement(By.id("amt7"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("credit1")), 
		driver.findElement(By.id("loan"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("fourth")), 
		driver.findElement(By.id("amt8")))
		.build().perform();*/
		
		
		
		
		
		

	}

}
