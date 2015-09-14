package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		driver.findElement(By.id("Email")).sendKeys("haisivakotireddy");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("Gold2013");
		driver.findElement(By.id("signIn")).click();
		
	
	}
}
