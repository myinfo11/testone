package wrapperPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrapper_method {
	RemoteWebDriver driver;
	public void invokeApp(String url) {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void enterByID(String id,String value) {
		driver.findElementById(id).clear();
		driver.findElementById(id).sendKeys(value);
	}
	
	public void clickByClass(String loc) {
		driver.findElementByClassName(loc).click();
	}
	
	public void clickByLink(String lnk) {
	driver.findElementByLinkText(lnk).click();		
	}
	
	public void clickById(String id) {
		driver.findElementById(id).click();
	}
	
	public void clickByName(String name) {
		driver.findElementByName(name).click();
		}
	
	public void clickByLinkText(String linktext)
	{
		driver.findElementByLinkText(linktext).click();
	}
	
	public void selectByVisibleTextUsingIdForDropDown(String id,String txt){
		WebElement dd = driver.findElementById(id);
		Select sdd = new Select(dd);
		sdd.selectByVisibleText(txt);
	}
	
	public void selectByVisibleTextUsingNameForDropDown(String name,String txt){
		WebElement dd = driver.findElementByName(name);
		Select sdd = new Select(dd);
		sdd.selectByVisibleText(txt);
	} 
	
	public void verifytextByClassName(String txt,String exp_txt)
	{
		
			if(driver.findElementByClassName(txt).getText().equalsIgnoreCase(exp_txt)){
				System.out.println("Pass");
			}
			
	}	
	
	public void closeApp() {		
		driver.close();
	}
	
	public void seliniumHubForFirefox()
	{
		
	}
	

}
