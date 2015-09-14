package thirdWeek_homeWork;

import org.testng.annotations.Test;

import wrapperPackage.Wrapper_method;

public class CreateLead_forTestNG_groups {
	
	@Test (groups ={"sanity"} )
	
		public static void createlead() throws InterruptedException {

			Wrapper_method wm=new Wrapper_method();
			wm.invokeApp("http://demo1.opentaps.org");  //logging in
			Thread.sleep(300);
			wm.enterByID("username","DemoSalesManager");
			Thread.sleep(300);
			wm.enterByID("password","crmsfa");
			wm.clickByClass("decorativeSubmit");
			wm.clickByLink("CRM/SFA");
			wm.clickByLinkText("Create Lead");       // creating Lead
			wm.enterByID("createLeadForm_companyName","TestLeaf");
			wm.enterByID("createLeadForm_firstName","SivaKotiReddy");
			wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_dataSourceId","Partner");
			wm.enterByID("createLeadForm_lastName","alla");
			wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_currencyUomId","INR - Indian Rupee");
			wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_industryEnumId","Computer Software");
			wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_ownershipEnumId","Sole Proprietorship");
			wm.enterByID("createLeadForm_description","Iam testing");
			wm.enterByID("createLeadForm_primaryPhoneCountryCode","+91");
			wm.enterByID("createLeadForm_generalCity","Chennai");
			//wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_industryEnumId","India"); //code india is hidden
			wm.enterByID("createLeadForm_generalPostalCode","FL 32901");
			wm.selectByVisibleTextUsingIdForDropDown("createLeadForm_generalStateProvinceGeoId","Florida");
			wm.enterByID("createLeadForm_generalAddress1","College Road");
			Thread.sleep(400);
			//wm.clickByName("submitButton");
	}

}
