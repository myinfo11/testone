package wrapperMethods;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class Wrapper_Methos_For_Chrome {
		
		ChromeDriver driverchrome;
		  public void selectValueByIndex(String url,String ddmenutext,int dropdownindex)
		  {
			  driverchrome=new ChromeDriver();
			  driverchrome.manage().window().maximize();
			  driverchrome.get(url);
			WebElement dropdown=driverchrome.findElementByLinkText(ddmenutext);
			Select dd1=new Select(dropdown);
			dd1.selectByIndex(dropdownindex);
			
			
		  }
		
	   public void switchToPrimaryWindow(String firstwinhand)
	   {
		   driverchrome.switchTo().window(firstwinhand);		
	   }
		
		   public void switchToFinalWindow(String finalwinhand)
		   {
			   driverchrome.switchTo().window(finalwinhand);		
		   }
	   
		public void switchToFrameByElement(String frameelement)
		{
			WebElement frame=driverchrome.findElementByTagName(frameelement);
			driverchrome.switchTo().frame(frame);
		}
		
		  public void switchToFirstFrame()
		  {
			  WebElement firstframe=driverchrome.findElementByTagName("iframe");
			  driverchrome.switchTo().frame(firstframe);
		  }
		  
	   public void acceptAlert()
	   {
	    	Alert a=driverchrome.switchTo().alert();
			a.accept();
	   }
	   
	      public void dismissAlert()
	      {
	        Alert a=driverchrome.switchTo().alert();
	  		a.dismiss();
	      }
	      
	   public void verifyTitle(String actualtitle)
	   {
		   String title=driverchrome.getTitle();
		   if(actualtitle.equalsIgnoreCase(title))
			   System.out.println("Current tile is same as expected");
			else
				System.out.println("Current title is not as expected");  
	   }
	      
	      public void verifyUrl(String actualurl)
	      {
		   String url=driverchrome.getCurrentUrl();
		   if(actualurl.equalsIgnoreCase(url))
			   System.out.println("Current url is same as expected");
			else
				System.out.println("Current url is not as expected");  
	      }
	   
	   public void takeSnapShot() throws IOException
	   {
		   File sshot=driverchrome.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(sshot,new File("C:\\Users\\admin\\Desktop\\Selenium\\Test leaf\\Week2 PPT and Code\\sshot1.png"));
	   }
	}

