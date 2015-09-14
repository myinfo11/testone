package secondWeekClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://irctc.co.in");
		driver.findElementByLinkText("Contact Us").click();
		//switch windows
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String win1: handles)
		{
			//move to browser
			driver.switchTo().window(win1);
			System.out.println(driver.getCurrentUrl());
		}
		//System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
