package thirdWeek_homeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrapperPackage.Wrapper_Method_For_Chrome;

public class Amazon_Sourced_excel_inChrome {

	Wrapper_Method_For_Chrome wmc=new Wrapper_Method_For_Chrome();
	
@BeforeClass
	public void launchBrowser()
	{
		wmc.invokeApp("http://amazon.in");
	}

@Test
	public void searchProduct() throws IOException
	{
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\amazonsearch.xlsx"));
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  XSSFRow row = sheet.getRow(0);
	  String searchproduct=row.getCell(1).getStringCellValue();
	wmc.enterByID("twotabsearchtextbox", searchproduct);
	wmc.clickByClass("nav-input");
	}

@Test (dependsOnMethods= {"searchProduct"} )
	public void selectProduct() throws IOException
	{
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\amazonsearch.xlsx"));
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  XSSFRow row0 = sheet.getRow(0);
	  String searchproduct=row0.getCell(1).getStringCellValue();
	  XSSFRow row1 = sheet.getRow(1);
	  int selectproduct=row1.getCell(1).getCellType();
	  wmc.elementByPartlinktxtGetLinksByIndex(searchproduct, selectproduct);
	}

@Test (dependsOnMethods= {"selectProduct"} )
	public void addToCart()
	{
	wmc.clickById("add-to-cart-button");
	}

@AfterClass
	public void closeBrowser() throws Exception
	{
	Thread.sleep(2000);
	wmc.closeApp();
	}

}


