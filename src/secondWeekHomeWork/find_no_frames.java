package secondWeekHomeWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class find_no_frames {

	public static void main(String[] args) throws InterruptedException {
		int count=0,i;
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(2000);
		int primaryframes=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Primary Frames = " +primaryframes);
	for(i=0;i<primaryframes;i++)
	{
		driver.switchTo().frame(i);
		Thread.sleep(2000);
		int secondaryframes=driver.findElementsByTagName("iframe").size();
		count=count+secondaryframes;
		System.out.println(" Number of frames in FrameIndex "+i + " are " +secondaryframes);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
	}
	 
	System.out.println(" Total number of frames are = " +(i+count));
 }

}
