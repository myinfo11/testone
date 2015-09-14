package one;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("myinfo11@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Gold2013");
		driver.findElement(By.id("u_0_x")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				
	}
	

}
