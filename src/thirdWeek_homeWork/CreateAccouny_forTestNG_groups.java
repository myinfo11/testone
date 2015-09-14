package thirdWeek_homeWork;

import org.testng.annotations.Test;

import wrapperPackage.Wrapper_Method_For_Chrome;;

public class CreateAccouny_forTestNG_groups {

	@Test (groups ={"smoke"} )
	public static void createaccount() throws InterruptedException {

		Wrapper_Method_For_Chrome wmc=new Wrapper_Method_For_Chrome();
		wmc.invokeApp("http://demo1.opentaps.org");  //logging in
		Thread.sleep(300);
		wmc.enterByID("username","DemoSalesManager");
		Thread.sleep(300);
		wmc.enterByID("password","crmsfa");
		wmc.clickByClass("decorativeSubmit");
		wmc.clickByLink("CRM/SFA");
		
		wmc.clickByLinkText("Create Account");  //Creating account
		wmc.enterByID("accountName","SivaKoti");
		wmc.enterByID("groupNameLocal", "Siva");
		wmc.selectByVisibleTextUsingNameForDropDown("industryEnumId","Computer Software");
		wmc.selectByVisibleTextUsingNameForDropDown("ownershipEnumId","Sole Proprietorship");
		wmc.selectByVisibleTextUsingNameForDropDown("dataSourceId","Partner");
		wmc.selectByVisibleTextUsingNameForDropDown("currencyUomId","INR - Indian Rupee");
		wmc.enterByID("primaryPhoneCountryCode","091");
		wmc.enterByID("generalCity","Chennai");
		wmc.enterByID("generalPostalCode","FL 32901");
		wmc.selectByVisibleTextUsingIdForDropDown("generalStateProvinceGeoId","Florida");
		//wm.clickByClass("smallSubmit");
	}

}
