package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {
	/*Scenario 1:

 

1.Open http://demowebshop.tricentis.com/ on any browser
2. click on Register
3. Click on Gender - Female
4. Enter firstname
5. Enter lastname
6. Enter Email
7. Enter password
8. Enter confirm password
9. Click on Register

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\LTI TRAINING\\installations\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//open application
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("raju");
		driver.findElement(By.id("LastName")).sendKeys("chavvakula");
		driver.findElement(By.id("Email")).sendKeys("chavaku9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("raju1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("raju1234");
		driver.findElement(By.id("register-button")).click();
		

	}

}
