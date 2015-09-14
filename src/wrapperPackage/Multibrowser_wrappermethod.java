package wrapperPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Multibrowser_wrappermethod {
	RemoteWebDriver driver;
	public void prefferedbrowser(String browser,String url){
		if(browser.equalsIgnoreCase("Firefox"))
		{
			FirefoxDriver driver;
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if (browser.equalsIgnoreCase("Chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		else if (browser.equalsIgnoreCase("IE")) 
		{
			
			System.setProperty("webdriver.ie.driver", "E:\\TestLeaf-Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
		}
		
	}

}
