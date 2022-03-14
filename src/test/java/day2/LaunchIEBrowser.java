package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iedriver.exe download
		
		System.setProperty("Webdriver.ie.driver", "D:\\LTI TRAINING\\installations\\IEDriverServer_x64_4.0.0\\iedriver.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		
		//driver.close();

	}

}
