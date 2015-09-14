package thirdWeek_homeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Amazon_Shopping_Sourced_Excel {
	
	RemoteWebDriver driver;
	// RemoteWebDriver remoteWD= null;
  
  @BeforeClass
  public void beforeClass() {
	  DesiredCapabilities capabilities=new DesiredCapabilities();
		 capabilities.setBrowserName("firefox");
		
		 try {
			 driver = new RemoteWebDriver( new URL("http://10.0.0.25:4441/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver=new FirefoxDriver();
		 driver.get("http://www.amazon.in");
	// driver.get("http://www.amazon.in");
	   
  }
  	
  @Test
  public void searchProduct() throws IOException, InterruptedException {
	  FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\amazonsearch.xlsx"));
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  XSSFRow row = sheet.getRow(0);
	  String searchproduct=row.getCell(1).getStringCellValue();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElementById("twotabsearchtextbox").sendKeys(searchproduct);
	  Thread.sleep(500);
	  driver.findElementByClassName("nav-input").click();
  }
  
  @Test (dependsOnMethods= {"searchProduct"} )
  public void selectProduct() throws IOException, Exception {
	  FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\amazonsearch.xlsx"));
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  XSSFRow row0 = sheet.getRow(0);
	  String searchproduct=row0.getCell(1).getStringCellValue();
	  XSSFRow row1 = sheet.getRow(1);
	  int selectproduct=row1.getCell(1).getCellType();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Thread.sleep(1000);
	  List<WebElement> alllinks = driver.findElementsByPartialLinkText(searchproduct);
	  alllinks.get(selectproduct).click();
	  Thread.sleep(1100);
	  
  }
  
  @Test (dependsOnMethods= {"selectProduct"} )
  public void addToCart() throws Exception {
	  System.out.println("In add to cart");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElementById("add-to-cart-button").click();
	  
  }
  
  
  @AfterClass
  public void afterClass() throws Exception {
	  Thread.sleep(2000);
	driver.close();
  }

}

