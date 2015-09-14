package wrapperMethods;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods {
	FirefoxDriver driver;
	  public void selectValueByIndex(String url,String ddmenutext,int dropdownindex)
	  {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement dropdown=driver.findElementByLinkText(ddmenutext);
		Select dd1=new Select(dropdown);
		dd1.selectByIndex(dropdownindex);
		
		
	  }
	
   public void switchToPrimaryWindow(String firstwinhand)
   {
		driver.switchTo().window(firstwinhand);		
   }
	
	   public void switchToFinalWindow(String finalwinhand)
	   {
			driver.switchTo().window(finalwinhand);		
	   }
   
	public void switchToFrameByElement(String frameelement)
	{
		WebElement frame=driver.findElementByTagName(frameelement);
		driver.switchTo().frame(frame);
	}
	
	  public void switchToFirstFrame()
	  {
		  WebElement firstframe=driver.findElementByTagName("iframe");
		  driver.switchTo().frame(firstframe);
	  }
	  
   public void acceptAlert()
   {
    	Alert a=driver.switchTo().alert();
		a.accept();
   }
   
      public void dismissAlert()
      {
        Alert a=driver.switchTo().alert();
  		a.dismiss();
      }
      
   public void verifyTitle(String actualtitle)
   {
	   String title=driver.getTitle();
	   if(actualtitle.equalsIgnoreCase(title))
		   System.out.println("Current tile is same as expected");
		else
			System.out.println("Current title is not as expected");  
   }
      
      public void verifyUrl(String actualurl)
      {
	   String url=driver.getCurrentUrl();
	   if(actualurl.equalsIgnoreCase(url))
		   System.out.println("Current url is same as expected");
		else
			System.out.println("Current url is not as expected");  
      }
   
   public void takeSnapShot() throws IOException
   {
	   File sshot=driver.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(sshot,new File("C:\\Users\\admin\\Desktop\\Selenium\\Test leaf\\Week2 PPT and Code\\sshot1.png"));
   }
}
