package Extras;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_CellReading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElementByXPath("/html/body/div[4]/div/div[2]/div[2]/div[1]/div/table[1]/tbody");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(int rnum=0;rnum<rows.size();rnum++)
		{
			List<WebElement> colums=rows.get(rnum).findElements(By.tagName("td"));
			for(int cnum=0;cnum<colums.size();cnum++)
			{
				System.out.print("  " +colums.get(cnum).getText());
			}
			System.out.println();
		}
		driver.findElementsByTagName("input").size();
		
		
	}

}
