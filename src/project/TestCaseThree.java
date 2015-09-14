package project;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrapper.Wrapper;

public class TestCaseThree {
	Wrapper wm;
	@Parameters({"browser"})
	@Test
	  public void testcasethree(String Browser) throws InterruptedException, IOException {
		  wm=new Wrapper();
		  String[] rowsdata;
		  
		  for( int i=1;i<3;i++)
		  {
			  rowsdata=wm.readFromExcelForARow("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\project\\Testata.xlsx", "Sheet2", i);
			  wm.login(Browser,rowsdata[0], rowsdata[1]);
		  
			  Thread.sleep(2000);
		  
		  wm.clickByLink("Advanced");
		  
		  wm.clickByXpath("//*[@class='text-button close-advs']");
		  Thread.sleep(2000);
		  wm.clickByXpath("//*[@id='pivot-bar']/ul/li[3]/button");
		  Thread.sleep(2000);
		  wm.clickByXpath("//*[@id='pivot-bar']/ul/li[2]/button");
		  
		  Thread.sleep(5000);
		  
		  String fcone = wm.getTextByXpath("//*[@id='results_count']/div/p/strong");
		  
		  String fctwo = wm.getTextByXpath("//*[@class='facet-value disabled selected']/div/span");
		  
		  //This is to replace the characters other than 0 to 9
		  String fctworemovebrackets = fctwo.replaceAll("[^0-9]", "");
		  System.out.println(fcone);
		  System.out.println(fctwo);
		  System.out.println(fctworemovebrackets);
		  
		  //use asserts to check conditions
				  
				  if (fcone.equals(fctworemovebrackets)) {
					  System.out.println("First	connection values are same");
				  }
				  else {
					System.out.println("First	connection values are not same");
				  }
				  
				  
		  Thread.sleep(5000);
		  
//		  wm.mousehover("//*[@class='nav utilities']/li[4]/a");
//		  //wm.clickByXpath("//*[@class='nav utilities']/li[4]/a");
//		  
//		  wm.clickByXpath("//*[@class='self']/div/span/span[3]/a");
//		  
//		  System.out.println("Testcase three is done");
		  
		  wm.logout();
		  wm.closeAllBrowsers();
		  }
	  }

}
