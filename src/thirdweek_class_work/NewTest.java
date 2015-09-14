package thirdweek_class_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void xlsbasictest() throws IOException {
	  
	  FileInputStream fis=new FileInputStream(new File("C:\\Users\\admin\\Desktop\\firstxl.xlsx"));
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet=wb.getSheetAt(0);
	  int r=sheet.getLastRowNum();
	  
	  for(int i=1;i<=r;i++){
		  XSSFRow r1=sheet.getRow(i);
		 System.out.println(r1.getCell(0).getStringCellValue());
		 System.out.println(r1.getCell(1).getStringCellValue());
		 
		 FirefoxDriver driver1 = new FirefoxDriver();
			driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			driver1.get("https://developer.salesforce.com");
			driver1.manage().window().maximize();
			driver1.findElementById("login-button").click();
			driver1.findElementById("username").sendKeys(r1.getCell(0).getStringCellValue());
			driver1.findElementById("password").sendKeys(r1.getCell(1).getStringCellValue());
			driver1.findElementById("Login").click();
			
	  }
  }
}
