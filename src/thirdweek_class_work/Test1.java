package thirdweek_class_work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {
  @Test
  public void TestinfClass() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Creating report name in BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("sending report in AS");
  }

}
