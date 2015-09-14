package Extras;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firefox_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String os = cap.getPlatform().toString();
		System.out.println("Platforn OS is : " +os);
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println("Browser name : " +browserName);
		String version = cap.getVersion().toString();
		System.out.println("Browser version: " +version);
		
	}

}
