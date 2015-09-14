package project;

import java.io.IOException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import wrapper.Wrapper;

public class TestCaseOne {
	
	Wrapper wm;
	@Parameters ({"browser"})
  @Test 
  public void verifyTitle(String Browser) throws IOException, InterruptedException {
	  String[] rowsdata;
	  wm= new Wrapper();
	  	  
	  
	  for (int i = 1; i < 3; i++) {
		
		rowsdata = wm.readFromExcelForARow(
				"C:\\Users\\admin\\Desktop\\Selenium\\Labs\\project\\Testata.xlsx", "Sheet2", i);
		
		wm.login(Browser,rowsdata[0], rowsdata[1]);
		Thread.sleep(1000);
	//	wm.clickByID("signin");
		wm.verifyTitle("Welcome! | LinkedIn");
		Thread.sleep(5000);
		
		wm.logout();
		wm.closeAllBrowsers();
	}
	  
  }
   
  
}

