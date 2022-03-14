package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxdiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","D:\\LTI TRAINING\\installations\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
	}

}
