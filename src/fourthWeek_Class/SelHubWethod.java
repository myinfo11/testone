package fourthWeek_Class;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelHubWethod {
	RemoteWebDriver driver;
	public void selHubmeth(String browser){
		
	
	DesiredCapabilities capabilities=new DesiredCapabilities();
    capabilities.setBrowserName(browser);
    capabilities.setPlatform(Platform.WINDOWS);
	
	 try {
		 driver = new RemoteWebDriver( new URL("http://10.0.0.25:4441/wd/hub"),capabilities);
	     } 
	 catch (MalformedURLException e) 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	}
}
