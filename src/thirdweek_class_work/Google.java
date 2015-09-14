package thirdweek_class_work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Google {
  @Test
  public void launchgoogle() {
	  System.out.println("Method to launch google");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("initializing chrome driver in BM");
  }
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Closing the chrome driver in AM");
  }
}

  