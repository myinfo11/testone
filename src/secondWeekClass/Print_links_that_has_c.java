package secondWeekClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_links_that_has_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> alllinks= driver.findElementsByTagName("a");
		System.out.println("Total no of links=" +alllinks.size());
		for(int i=0;i<=alllinks.size();i++)
		{
			if(alllinks.get(i).getText().contains("c")){
				System.out.println("Link Text="+alllinks.get(i).getText());
				System.out.println("Link Location="+alllinks.get(i).getLocation());
				System.out.println("Lonk Dimention"+alllinks.get(i).getSize());
			}
			
		}
		
	}

}
