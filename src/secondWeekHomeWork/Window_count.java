package secondWeekHomeWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Window_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.crystalcruises.com");
		String firstwinhand=driver.getWindowHandle();
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println("1st " +driver.getCurrentUrl());
		//Set<String> allhandles=driver.getWindowHandles();
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		System.out.println("2nd window: " +driver.getCurrentUrl());
		String secondwinhand=driver.getWindowHandle();
		driver.findElementByLinkText("click here").click();
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
			
		}
		System.out.println("3rd window: " +driver.getCurrentUrl());
		String thirdwinhand=driver.getWindowHandle();
		WebElement lang=driver.findElementByTagName("select");
		Select language=new Select(lang);
		language.selectByVisibleText("Telugu");
		System.out.println(driver.getWindowHandles());
		driver.switchTo().window(firstwinhand);
		System.out.println("Iam switched to 1st window & url is" +driver.getCurrentUrl());
		driver.switchTo().window(secondwinhand);
		System.out.println("Iam switched to 2nd window & url is" +driver.getCurrentUrl());
		driver.switchTo().window(thirdwinhand);
		System.out.println("Iam switched to 3rd window & url is" +driver.getCurrentUrl());
		
	}

}
