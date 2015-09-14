package wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.Select;


/**
 * @author Narendran
 *
 */
public class Wrapper {
	RemoteWebDriver driver;
	String parent;
	int i =0;
	
	/* *This method instaniate a new broswer for webdriver
	 * @param url This is the  URL which needs to be opened to run the method
	 * @param browser This is the type of browser to be opened(eg.firefox)
	 * 
	 * 
	 */
	public void invokeApp(String url,String browser){ 
	
	try {
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	parent = driver.getWindowHandle();
	} catch (WebDriverException e) {
		// TODO: handle exception
		System.out.println("Browser not available");
	}
}
	
	
	/**This method finds an Element in a webpage by id and enters a string value
	 * @param id This is the id of the element to be found
	 * @param value This is the text input to be entered in the field
	 * @throws NoSuchElementException
	 */
	public void enterById(String id, String value){
		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(value);
		} catch ( NoSuchElementException e) {
			System.out.println("Element with id"+id+" not found");
		}
		}
	 
	
	/**This method finds an Element in a webpage by class and clicks it
	 * @param classNaame This is the class Name of the Element to be found
	 */
	
	public void clickByClass(String className){
		try {
			driver.findElementByClassName(className).click();
		} catch (NoSuchElementException e) {
			
			System.out.println("Element with class as "+className+" not found");
		} catch (WebDriverException e1) {
			// TODO: handle exception
			System.out.println("Browser not available");
		}
	}
	
	
	/**This method finds an link in a webpage by link text and clicks it
	 * @param linktxt This is the text of the link
	 */
	public void clickByLink(String linktxt) {
		try {
			driver.findElementByLinkText(linktxt).click();
		} catch (NoSuchElementException e) {
			System.out.println("Element with link text "+linktxt+" not found");
			System.exit(0);
		}
	}
	
	  public void login(String Browser,String username,String pass) throws InterruptedException {
//		  wrapperobj=new Wrapper();
		  invokeApp("https://www.linkedin.com/nhome/",Browser);
		  enterById("session_key-login", username);
		  enterById("session_password-login",pass);
		  Thread.sleep(1000);
		  clickByID("signin");
	  }
	  public void logout() throws InterruptedException {
		  
			Thread.sleep(3000);
		  mousehover("//*[@class='nav utilities']/li[4]/a");
		  //wm.clickByClass("account-submenu-split-link");
		  Thread.sleep(3000);
		  clickByLink("Sign Out");
	  }
	
	/**This method selects a given value in a dropdown
	 * @param id This is the id of the dropdown
	 * @param txt This is the visible text of the option to be selected in the dropdown
	 */
	public void selectByVisibleTxtUsingId(String id, String txt ){
		try {
			Select dd = new Select(driver.findElementById(id));
			dd.selectByVisibleText(txt);
		}catch (NoSuchElementException e) {
			System.out.println("Element with id as "+id+" not found");
			System.exit(0);
		}
	}
	
	
	/**This method selects a element by its name  in the webpage
	 * @param name This is the name of the webelement
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
		} catch (NoSuchElementException e) {
			System.out.println("Element with class name "+name+" not found");
			System.exit(0);
	}}
	
	
	
	/**This method identifies a webelement.Then takes the text in the element and compare it with the expected one.
	 * @param classname This is the class name of the element to be found
	 * @param exp_value This s the expected  text value the element should have
	 * @throws NoSuchElementException
	 */
	public void verifyTextByClassname(String classname,String exp_value) {
		try {
			System.out.println(driver.findElementByClassName(classname).getText());
			if(driver.findElementByClassName(classname).getText().equalsIgnoreCase(exp_value)){
				System.out.println("pass");
			}
			else {
				System.out.println("Fail");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element with class name "+classname+" not found");
			System.exit(0);
		}catch(WebDriverException e1){
			System.out.println("WebDriver instance not available");
		}
	}
	
	
	
	
	/**This method closes all the browser opened by the webdrivder
	 * @throws catch (NoSuchElementException e) {
			System.out.println("Element with class name "+classname+" not found");
			System.exit(0);
		}
	 */
	public void closeAllBrowsers()  {
		try {
			driver.close();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	
	/**This method identifies a drop down by class name and select a value in the dropdown by Index
	 * @param classname This is the class name of the 
	 * @param index
	 */
	public void selectByIndexUsingClassName(String classname, int index) {
		try {
			Select dd = new Select(driver.findElementByClassName(classname));
			dd.selectByIndex(index);
		} catch (NoSuchElementException e) {
			System.out.println("Element with class name "+classname+" not found");
			System.exit(0);
		}
	}
	
	
	public void switchToPrimaryWindow(String url ) {
//		Set<String> primary = driver.getWindowHandles();
//		for (String handle : primary) {
//			driver.switchTo().window(handle);
//			if (driver.getCurrentUrl().equals(url)) {
//				break;
//			}
//		}
		
		driver.switchTo().window(parent);
	}
	
	
	public void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	public void dismissAlert(){
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	
	public void switchToFrameById(String id) {
		driver.switchTo().frame(driver.findElementById(id));
	}
	
	
	public void verifyTitle(String title) {
		if(driver.getTitle().contains(title)){
			System.out.println("Tite matches");
		}
		else {
			System.out.println("Title don't mactch");
		}
	}
	
	
	public void enterByName(String name, String text) {
		driver.findElementByName(name).clear();
		driver.findElementByName(name).sendKeys(text);
	}
	
	
	public void clickByXpath(String xpath) {
		driver.findElementByXPath(xpath).click();
	}
	
	
	public void switchWindowUsingUrl(String url) {
		Set<String> window = driver.getWindowHandles();
		for (String handle : window) {
			driver.switchTo().window(handle);
			if (driver.getCurrentUrl().equals(url)) {
				break;
			}
		}
	}
	
	
	
	public void clickByID(String id) {
		driver.findElementById(id).click();
	}
	
	

	public void countIFrame(String tagname) {
		List<WebElement> frame = driver.findElementsByTagName(tagname);
		int outerframe = frame.size();
		int innerframe = 0;
		System.out.println("outerframe:"+outerframe);
		for (int i = 0; i < outerframe; i++) {
			driver.switchTo().frame(i);
			List<WebElement> frames = driver.findElementsByTagName(tagname);
			//int j = 0;
			System.out.println(frames.size());
			//innerframe = frames.size();
			innerframe = innerframe + frames.size();
			driver.switchTo().defaultContent();
			}
		int total = outerframe + innerframe;
			System.out.println("Total tag count:"+total);
		}
	
	
	public void closeIframe() {
		List<WebElement> frame = driver.findElementsByTagName("iframe");
		int outerframe = frame.size();
		int innerframe = 0;
		System.out.println("outerframe:"+outerframe);
		for (int i = 0; i < outerframe; i++) {
			driver.switchTo().frame(i);
			//List<WebElement> frames = driver.findElementsByTagName("iframe");
			driver.findElementByName("Close Me").click();
		}
	}
	
	
	public void getLinkWithName() {
		List<WebElement> link = driver.findElementsByTagName("a");
		int linkcount = 0 ;
		System.out.println(link.size());
		for (int i = 0; i < link.size()-1; i++) {
			if(link.get(i).getText().contains("Mike")){
						System.out.println(link.get(i).getAttribute("href"));
						linkcount = linkcount + 1;
				}
			else {
				System.out.println("no link");
			}
						
			}
				System.out.println("Link count :" +linkcount);		
		}
	
	
	public void switchToLastWindow() {
		
			Set<String> window = driver.getWindowHandles();
			for(String handle: window){
				driver.switchTo().window(handle);
				
			}
			
		}
		
	
	
	public void takeScreensshot() throws Exception {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Selenium\\Selenium\\ss\\Screenshot_"+i+".jpg"));
		
	}
	public String getTextByXpath(String xPath) {
		return driver.findElementByXPath(xPath).getText();
	}
	
	public void mousehover(String xPath){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElementByXPath(xPath)).build().perform();
		
	}
	
	public String[] readFromExcelForARow(String filename,String sheet,int row) throws IOException
		{
			String[] datasincell = new String[3];
		try
		{
			
			 FileInputStream fis = new FileInputStream(new File(filename));
			 XSSFWorkbook wb= new XSSFWorkbook(fis);	  
			 XSSFSheet mysheet = wb.getSheet(sheet); 
				  XSSFRow myrow = mysheet.getRow(row);
				  int totalcell = myrow.getLastCellNum();
				  System.out.println("total cells = "+totalcell);
				  for (int i = 0; i <totalcell; i++) 
				  {
					  datasincell[i] =  myrow.getCell(i).getStringCellValue(); 
				  }
		  
		}catch(IOException ioe)
		{
		System.out.println("IOException occured"+ioe);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		return datasincell;
		}
	

   }


		



