package secondWeekHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMe_Frames {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		int primaryframes=driver.findElementsByTagName("iframe").size();
		System.out.println("Total no of Primary frames are = " +primaryframes);
		driver.switchTo().frame(0);
		int secondaryframes=driver.findElementsByTagName("iframe").size();
		System.out.println("Total no of Secondary frames are = " +secondaryframes);
		System.out.println("Iam in 1st Frame,Closing Iframe West & Iframe East");    //Closing Iframe West & Iframe East 
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		Thread.sleep(500);
		driver.findElementByXPath("/html/body/div[3]/p/button").click();	
		driver.switchTo().defaultContent();
		System.out.println("iam switched back to defaultcontent,Closing West & East");  //Closing West & East
		Thread.sleep(500);
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		Thread.sleep(500);
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		Thread.sleep(800);
	}

}
