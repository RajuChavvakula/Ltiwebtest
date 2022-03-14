package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabletest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\LTI TRAINING\\\\installations\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		Thread.sleep(5000);
		//fetch n.o of columns
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("column size is :"+col.size());
		//fetch n.o rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tbody/tr"));
		System.out.println("n.o of rows is :"+rows.size());
		//fetch specific data from the cell
		String cell=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if(cell.equals("A")) {
			System.out.println("data validation is success");
		}else {
			System.out.println("data is incorrect");
		}
		//check which company is top
		String toplist=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("top company name is :"+toplist);
		//fetch top 5 company list
		for(int i=1;i<=5;i++) {
			String list=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(list);
		}

	}

}
