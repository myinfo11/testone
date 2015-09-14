package secondWeekClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframes_text_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByTagName("button").click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("Siva");
		a.accept();
		if(driver.findElementById("demo").getText().contains("Siva"))
		{
			System.out.println("True");
		}
		
	}

}
