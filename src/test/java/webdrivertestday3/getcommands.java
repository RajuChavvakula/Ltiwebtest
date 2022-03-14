package webdrivertestday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\LTI TRAINING\\\\\\\\installations\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title of the page is :" + title);
		if (title.equals("Demo Web Shop")) {
			System.out.println("title is correct");
		}
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		//fetch html source of page
		System.out.println(driver.getPageSource());
		//move back
		driver.navigate().back();
		//move forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		//driver.close();

	}

}
