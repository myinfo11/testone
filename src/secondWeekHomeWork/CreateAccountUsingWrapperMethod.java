package secondWeekHomeWork;
import wrapperPackage.Wrapper_method;

public class CreateAccountUsingWrapperMethod {
	
	public static void main(String[] args) throws InterruptedException {

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
		
		wm.clickByLinkText("My Home");
		wm.clickByLinkText("Create Account");  //Creating account
		wm.enterByID("accountName","SivaKoti");
		wm.enterByID("groupNameLocal", "Siva");
		wm.selectByVisibleTextUsingNameForDropDown("industryEnumId","Computer Software");
		wm.selectByVisibleTextUsingNameForDropDown("ownershipEnumId","Sole Proprietorship");
		wm.selectByVisibleTextUsingNameForDropDown("dataSourceId","Partner");
		wm.selectByVisibleTextUsingNameForDropDown("currencyUomId","INR - Indian Rupee");
		wm.enterByID("primaryPhoneCountryCode","091");
		wm.enterByID("generalCity","Chennai");
		wm.enterByID("generalPostalCode","FL 32901");
		wm.selectByVisibleTextUsingIdForDropDown("generalStateProvinceGeoId","Florida");
		//wm.clickByClass("smallSubmit");
		
		
	}

}
