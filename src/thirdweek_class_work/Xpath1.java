package thirdweek_class_work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/gp/goldbox/ref=nav_topnav_deals");
		driver.manage().window().maximize();
		int a=driver.findElementsByXPath("//*[@title='Add to cart']").size();
		System.out.println("no of link = " +a);

	}

}
