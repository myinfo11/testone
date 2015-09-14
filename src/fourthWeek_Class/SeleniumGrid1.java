package fourthWeek_Class;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid1 {

	public static void main(String[] args) throws InterruptedException {
	 DesiredCapabilities capabilities=new DesiredCapabilities();
	 capabilities.setBrowserName("firefox");
	 capabilities.setPlatform(Platform.WINDOWS);
	 RemoteWebDriver remoteWD= null;
	 try {
		 remoteWD = new RemoteWebDriver( new URL("http://192.168.11.53:4444/wd/hub"),capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 remoteWD.get("http://www.google.co.in");
	 Thread.sleep(3100);
	 
	 System.out.println("Executed in node");
	 
	 //remoteWD.close();
	}

}
