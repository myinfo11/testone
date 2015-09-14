package secondWeekHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClickOn_Draggable_Droppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com");
		driver.findElementByLinkText("Draggable").click();
		WebElement iframe=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(iframe);
		String draggabletext=driver.findElementById("draggable").getText();
		System.out.println("the Content of the element is = " +draggabletext);
		driver.switchTo().defaultContent();
		Thread.sleep(1100);
		driver.findElementByLinkText("Droppable").click();
		System.out.println("Successfully clicked on droppable");
		
	}

}
