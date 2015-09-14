package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/Google-Nexus-D821-16GB-Black/dp/B00GC1J55C/ref=sr_1_1?ie=UTF8&qid=1436557392&sr=8-1&keywords=nexus+5");
		driver.findElementById("add-to-cart-button").click();
	}
	
}
