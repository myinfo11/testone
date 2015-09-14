package secondWeekHomeWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_frames {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElementByTagName("button").click();
		//driver.switchTo().alert();
		//System.out.println(driver.findElementById("demo").getText());
		//driver.findElementById("demo").click();	
		driver.switchTo().alert().dismiss();
		//driver.switchTo().frame("iframeResult");
		String txt=driver.findElementById("demo").getText();
		System.out.println("Hay "+txt);
	}

}
