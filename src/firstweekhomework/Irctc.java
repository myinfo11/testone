package firstweekhomework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		driver.findElementByName("userName").sendKeys("slat1111");
		WebElement questiondd = driver.findElementByName("question");
		Select quedd = new Select(questiondd);
		quedd.selectByIndex(1);
		driver.findElementByName("answer").sendKeys("pets"); //security ques
		driver.findElementByName("firstName").sendKeys("Siva");
		Thread.sleep(500);
		driver.findElementByName("lastName").sendKeys("Koti");
		WebElement genderdd = driver.findElementByName("gender"); //gender dropdown
		Select gendd = new Select(genderdd);
		gendd.selectByIndex(0);
		WebElement mariagedd = driver.findElementByName("maritalStatus"); //Marital status
		Select mrgdd = new Select(mariagedd);
		mrgdd.selectByIndex(0);
		
		WebElement date = driver.findElementByName("day"); //DOB date
		Select dte = new Select(date);
		dte.selectByIndex(1);
		
		Thread.sleep(500);
		WebElement month = driver.findElementByName("month"); //DOB Month
		Select mntdd = new Select(month);
		mntdd.selectByIndex(10);
		
		Thread.sleep(500);
		
		WebElement yeardd = driver.findElementByName("year"); //DOB Year
		//Select year = new Select(yeardd);
		//year.selectByValue("1983");
		
		WebElement occupationdd = driver.findElementByName("occupation"); //Occupation
		Select occupation = new Select(occupationdd);
		occupation.selectByIndex(3);
		
		driver.findElementById("aadharCard").sendKeys("412943208725");
		Thread.sleep(500);
		driver.findElementByName("email").sendKeys("myinfo11@gmail.com");
		driver.findElementByName("mobile").sendKeys("8138963295");
		
		WebElement nationalitydd = driver.findElementByName("nationality");
		Select nationality = new Select(nationalitydd);
		nationality.selectByValue("India");
		
		//Res Address
		
		driver.findElementByName("resAddress1").sendKeys("Door no 21, 23th street");
		Thread.sleep(500);
		driver.findElementByName("resAddress2").sendKeys("T G Nagar, Nanganallur");
		driver.findElementByName("resAddress3").sendKeys("Chennai");
		
		WebElement countrydd = driver.findElementByName("resCountry");
		Select country = new Select(countrydd);
		country.selectByValue("India");
		
		driver.findElementById("resPinCode").sendKeys("600061");
		driver.findElementById("resPinCode").sendKeys(Keys.TAB);
		
		
		driver.findElementByName("resPhone").sendKeys("8138964595");
		
		driver.findElementById("rdresyes").click();
		
		driver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[1]/td[2]/input[2]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[2]/td[2]/input[2]").click();
		driver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[3]/td[2]/input[2]").click();
	
		driver.findElementById("resState").click();
		Thread.sleep(500);
		WebElement citydd = driver.findElementById("resCity");
		Select city = new Select(citydd);
		city.selectByIndex(1);
		
		
	}

}
