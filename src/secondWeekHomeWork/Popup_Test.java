package secondWeekHomeWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://popuptest.com");
		String parentwindowtitle=driver.getTitle();
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Thread.sleep(1500);
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String win1:handles)
		{
			driver.switchTo().window(win1);
			driver.close();	
			Thread.sleep(500);
		}
		System.out.println("Parent Window Title is = " +parentwindowtitle);
		driver.quit();
		Thread.sleep(1100);   //This method also works
		/*Set<String> handles1=driver.getWindowHandles();
		System.out.println(handles1);
		for(String win2:handles1)
		{
			driver.switchTo().window(win2);
			driver.close();	
			Thread.sleep(500);
		}
		 */
	}

}
