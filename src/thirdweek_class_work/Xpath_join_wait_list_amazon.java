package thirdweek_class_work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_join_wait_list_amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/gp/goldbox/ref=nav_topnav_deals");
		driver.manage().window().maximize();
		int a=driver.findElementsByXPath("//*[@title='Join Waitlist']").size();		
		System.out.println("no of link in Join WishList= " +a);

	}

}
