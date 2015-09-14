package wrapperPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrapper_Method_For_Chrome {
	
	ChromeDriver driverchrome;
	
	
	public void invokeApp(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
		driverchrome = new ChromeDriver();
		driverchrome.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driverchrome.manage().window().maximize();
		driverchrome.get(url);
	}
	
	public void enterByID(String id,String value) {
		driverchrome.findElementById(id).clear();
		driverchrome.findElementById(id).sendKeys(value);
	}
	
	public void clickByClass(String loc) {
		driverchrome.findElementByClassName(loc).click();
	}
	
	public void clickByLink(String lnk) {
		driverchrome.findElementByLinkText(lnk).click();		
	}
	
	public void clickById(String id) {
		driverchrome.findElementById(id).click();
	}
	
	public void clickByName(String name) {
		driverchrome.findElementByName(name).click();
		}
	
	public void clickByLinkText(String linktext)
	{
		driverchrome.findElementByLinkText(linktext).click();
	}
	
	public void selectByVisibleTextUsingIdForDropDown(String id,String txt){
		WebElement dd = driverchrome.findElementById(id);
		Select sdd = new Select(dd);
		sdd.selectByVisibleText(txt);
	}
	
	public void selectByVisibleTextUsingNameForDropDown(String name,String txt){
		WebElement dd = driverchrome.findElementByName(name);
		Select sdd = new Select(dd);
		sdd.selectByVisibleText(txt);
	}
	
	public void elementByPartlinktxtGetLinksByIndex(String txt,int index) {
		List<WebElement> alllinks = driverchrome.findElementsByPartialLinkText(txt);
		  alllinks.get(index).click();
		
	}
	
	public void verifytextByClassName(String txt,String exp_txt)
	{
		
			if(driverchrome.findElementByClassName(txt).getText().equalsIgnoreCase(exp_txt)){
				System.out.println("Pass");
			}
			
	}	
	
	public void closeApp() {		
		driverchrome.close();
	}


}
