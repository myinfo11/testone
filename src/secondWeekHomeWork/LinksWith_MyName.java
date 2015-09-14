package secondWeekHomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksWith_MyName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=0;
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElementById("lst-ib").sendKeys("sivakotireddy");
		driver.findElementByName("btnG").click();
		Thread.sleep(2500);
		List<WebElement> alllinks=driver.findElementsByTagName("a");
		int a=alllinks.size();
		System.out.println("total provided links for my name = " +a);
		for(WebElement onelink:alllinks)
		{
			if(onelink.getText().toLowerCase().contains("siva"))
			{
				System.out.println("Matched Link =" +onelink.getText());
				i++;
			}
		}
		System.out.println("Number of links contains my name =" +i);
	}

}
