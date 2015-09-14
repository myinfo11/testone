package thirdWeek_homeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDiagonalReverse {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\NumbersInDiagonal.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  XSSFSheet sheet0 = workbook.getSheetAt(0);
		  XSSFSheet sheet1 = workbook.getSheetAt(1);
		  int j=sheet0.getLastRowNum();
		  System.out.println("Last row num of Sheet o = " +j);
		  
		  for(int i=1;i<=10;i++)
		  {
			 
			  XSSFRow row = sheet0.getRow(i);
			  String fromsh0=row.getCell(i).getRawValue();
			  System.out.println("Cell value sheet 0 = " +fromsh0);
			  sheet1.createRow(j).createCell(j).setCellValue(fromsh0);
			  FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\admin\\Desktop\\Selenium\\Labs\\Siva Selenium Works\\NumbersInDiagonal.xlsx"));
			  workbook.write(fos);
			  j--;
		  }
	   System.out.println("Done");	  
	}
}
