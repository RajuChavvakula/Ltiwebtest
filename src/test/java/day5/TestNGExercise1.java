package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExercise1 {
  @Test
  public void f() {
  }
  @BeforeMethod //equivalent to @before in junit
  public void beforeMethod() {
	  System.out.println("Chrome browser is launching and open appln");
  }

  @AfterMethod  //equivalent to @after in junit
  public void afterMethod() {
	  System.out.println("Closing appln");
  }

  @BeforeClass //execute once before the class gets loaded
  public void beforeClass() {
	  System.out.println("chrome browser is launching and open appln-before class");
  }

  @AfterClass //execute once after all the class test gets loaded 
  public void afterClass() {
	  System.out.println("chrome browser is launching and closing appln-after class");
  }

  @BeforeTest //execute once before @Beforeclass
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest //execute once after @Afterclass executed
  public void afterTest() {
	  System.out.println("after test");
  }

}
