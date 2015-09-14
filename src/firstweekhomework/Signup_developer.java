package firstweekhomework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_developer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("https://developer.salesforce.com");
		driver.manage().window().maximize();
		
		//driver.findElementByLinkText("Sign Up").click(); 
		driver.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
		driver.findElementById("first_name").sendKeys("SivaKoti");
		driver.findElementById("last_name").sendKeys("a");
		driver.findElementById("email").sendKeys("myinfo11@gmail.com");
		
		 WebElement jobrolldd = driver.findElementById("job_role");
		 
		 Select drop = new Select(jobrolldd);
		 drop.selectByIndex(0);
		 driver.findElementById("company").sendKeys("TestLeaf");
		 
		 WebElement countrydd = driver.findElementById("country");
		 Select cntydd = new Select(countrydd);
		 cntydd.selectByVisibleText("India");
		 
		 driver.findElementById("postal_code").sendKeys("600061");
		 
		 driver.findElementById("username").sendKeys("myinfo11@gmail.com");
		 driver.findElementById("eula").click();
		 driver.findElementById("submit_btn").click();
		 Thread.sleep(3000);
		 driver.close(); //signup windows closing
		 
		 
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver1.get("https://developer.salesforce.com");
		driver1.manage().window().maximize();
		driver1.findElementById("login-button").click();
		driver1.findElementById("username").sendKeys("myinfo11@gmail.com");
		driver1.findElementById("password").sendKeys("TestLeaf@123");
		driver1.findElementById("Login").click();
		Thread.sleep(4000);
	}

}
