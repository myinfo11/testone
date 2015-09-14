package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Namegooglefirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
				
		driver.get("http://google.com");
		
		driver.findElementById("lst-ib").sendKeys("Siva");
		driver.findElementByName("btnG").click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		
		System.out.println("Title is " + driver.getTitle());
		if (title.contains("Siva"))
		{
		System.out.println("Pass");
		}
	}

}
