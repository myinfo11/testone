package project;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrapper.Wrapper;

public class TestCaseTwo {
	Wrapper wrapperobj;
	@Parameters({"browser"})
  @Test
  public void searchKeyword(String Browser) throws InterruptedException, IOException {
	  wrapperobj=new Wrapper();
	  String[] rowsdata;
	
	 
	   for (int i = 1; i < 3; i++) {
		rowsdata = wrapperobj.readFromExcelForARow(
				"C:\\Users\\admin\\Desktop\\Selenium\\Labs\\project\\Testata.xlsx", "Sheet2", i);
		wrapperobj.login(Browser,rowsdata[0], rowsdata[1]);
		Thread.sleep(2000);
		wrapperobj.clickByLink("Advanced");
		wrapperobj.enterById("advs-keywords", rowsdata[2]);
		wrapperobj.clickByClass("submit-advs");
		Thread.sleep(1000);
		String results = wrapperobj
				.getTextByXpath("//*[@id='results_count']/div/p/strong");
		System.out.println("The number of results returned" + results);
		Thread.sleep(1000);
		
		String linkname = wrapperobj
				.getTextByXpath("//*[@id='results']/li[2]/div/h3/a");
		
		System.out.println("The link name is" + linkname);
		Thread.sleep(1000);
		String connection = wrapperobj
				.getTextByXpath("//*[@id='results']/li[2]/div/h3/span/span/abbr");
		System.out.println("the connection is" + connection);
		Thread.sleep(1000);
		
		wrapperobj.logout();
		wrapperobj.closeAllBrowsers();
	   }
	  
  }
  }

