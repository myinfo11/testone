package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Namegooglechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "E:\\TestLeaf-Selenium\\drivers\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
				
		driver.get("http://google.com");
		
		driver.findElementById("lst-ib").sendKeys("Siva");
		

	}

}
