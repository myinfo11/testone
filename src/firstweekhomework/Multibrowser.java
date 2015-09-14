package firstweekhomework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Multibrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++)
			
		{
			if(i==1)
			{
				System.out.println("Initiating Firefox Browser");
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://irctc.co.in");     //irctc firefox signup
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
				Select year = new Select(yeardd);
				year.selectByValue("1983");
				
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
				Thread.sleep(2000);
				driver.close(); // irctc firefox signup closing
				
				FirefoxDriver driver1 = new FirefoxDriver(); //Start Developer force signup in Firefox
				driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver1.manage().window().maximize();
				driver1.get("https://developer.salesforce.com");
				//driver.findElementByLinkText("Sign Up").click(); 
				driver1.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
				driver1.findElementById("first_name").sendKeys("SivaKoti");
				driver1.findElementById("last_name").sendKeys("a");
				driver1.findElementById("email").sendKeys("myinfo11@gmail.com");
				
				 WebElement jobrolldd = driver1.findElementById("job_role");
				 
				 Select drop = new Select(jobrolldd);
				 drop.selectByIndex(0);
				 driver1.findElementById("company").sendKeys("TestLeaf");
				 
				 WebElement countrydd1 = driver1.findElementById("country");
				 Select cntydd1 = new Select(countrydd1);
				 cntydd1.selectByVisibleText("India");
				 
				 driver1.findElementById("postal_code").sendKeys("600061");
				 
				 driver1.findElementById("username").sendKeys("myinfo11@gmail.com");
				 driver1.findElementById("eula").click();
				 //driver1.findElementById("submit_btn").click();
				 Thread.sleep(2000);
				 driver1.close();        //signup Developer force firefox windows closing
				 
				 
				FirefoxDriver driver2 = new FirefoxDriver();  //Developer force login in Firefox
				driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
				driver2.get("https://developer.salesforce.com");
				driver2.manage().window().maximize();
				driver2.findElementById("login-button").click();
				driver2.findElementById("username").sendKeys("myinfo11@gmail.com");
				driver2.findElementById("password").sendKeys("TestLeaf@123");
				driver2.findElementById("Login").click();
				Thread.sleep(2000);
				driver2.close();      //Developer force login verified in Firefox and closed
				System.out.println("Firefox Browser closed");
			} 
			
			     if(i==2)
			   {
			    	System.out.println("Initiating Internet Explorer"); 
				    System.setProperty("webdriver.ie.driver", "E:\\TestLeaf-Selenium\\drivers\\IEDriverServer.exe");		
					InternetExplorerDriver iedriver = new InternetExplorerDriver();
					iedriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					iedriver.manage().window().maximize();
					iedriver.get("https://irctc.co.in");     //irctc signup in IE starting
					iedriver.findElementByLinkText("Sign up").click();
					iedriver.findElementByName("userName").sendKeys("slat1111");
					WebElement questiondd = iedriver.findElementByName("question");
					Select quedd = new Select(questiondd);
					quedd.selectByIndex(1);
					iedriver.findElementByName("answer").sendKeys("pets"); //security ques
					iedriver.findElementByName("firstName").sendKeys("Siva");
					Thread.sleep(500);
					iedriver.findElementByName("lastName").sendKeys("Koti");
					WebElement genderdd = iedriver.findElementByName("gender"); //gender dropdown
					Select gendd = new Select(genderdd);
					gendd.selectByIndex(0);
					WebElement mariagedd = iedriver.findElementByName("maritalStatus"); //Marital status
					Select mrgdd = new Select(mariagedd);
					mrgdd.selectByIndex(0);
					
					WebElement date = iedriver.findElementByName("day"); //DOB date
					Select dte = new Select(date);
					dte.selectByIndex(1);
					
					Thread.sleep(500);
					WebElement month = iedriver.findElementByName("month"); //DOB Month
					Select mntdd = new Select(month);
					mntdd.selectByIndex(10);
					
					Thread.sleep(500);
					
					WebElement yeardd = iedriver.findElementByName("year"); //DOB Year
					Select year = new Select(yeardd);
					year.selectByValue("1983");
					
					WebElement occupationdd = iedriver.findElementByName("occupation"); //Occupation
					Select occupation = new Select(occupationdd);
					occupation.selectByIndex(3);
					
					iedriver.findElementById("aadharCard").sendKeys("412943208725");
					Thread.sleep(500);
					iedriver.findElementByName("email").sendKeys("myin@gmail.com");
					iedriver.findElementByName("mobile").sendKeys("8138963295");
					
					WebElement nationalitydd = iedriver.findElementByName("nationality");
					Select nationality = new Select(nationalitydd);
					nationality.selectByValue("India");
					
					//Res Address
					
					iedriver.findElementByName("resAddress1").sendKeys("Door no 21, 23th street");
					Thread.sleep(500);
					iedriver.findElementByName("resAddress2").sendKeys("T G Nagar, Nanganallur");
					iedriver.findElementByName("resAddress3").sendKeys("Chennai");
					
					WebElement countrydd = iedriver.findElementByName("resCountry");
					Select country = new Select(countrydd);
					country.selectByValue("India");
					
					iedriver.findElementById("resPinCode").sendKeys("600061");
					iedriver.findElementById("resPinCode").sendKeys(Keys.TAB);
					
					
					iedriver.findElementByName("resPhone").sendKeys("8138964595");
					
					iedriver.findElementById("rdresyes").click();
					
					iedriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[1]/td[2]/input[2]").click();
					Thread.sleep(1000);
					iedriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[2]/td[2]/input[2]").click();
					iedriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[3]/td[2]/input[2]").click();
				
					iedriver.findElementById("resState").click();
					Thread.sleep(500);
					WebElement citydd = iedriver.findElementById("resCity");
					Select city = new Select(citydd);
					city.selectByIndex(1);
					Thread.sleep(2000);
					iedriver.close();     //irctc signup in IE finished
					
					System.setProperty("webdriver.ie.driver", "E:\\TestLeaf-Selenium\\drivers\\IEDriverServer.exe");		
					InternetExplorerDriver iedriver1 = new InternetExplorerDriver();
					iedriver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					iedriver1.manage().window().maximize();
					iedriver1.get("https://developer.salesforce.com");   //Developer forcr signup in IE stating
					//driver.findElementByLinkText("Sign Up").click(); 
					iedriver1.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
					iedriver1.findElementById("first_name").sendKeys("SivaKoti");
					iedriver1.findElementById("last_name").sendKeys("a");
					iedriver1.findElementById("email").sendKeys("mine@gmail.com");
					
					 WebElement jobrolldd = iedriver1.findElementById("job_role");
					 
					 Select drop = new Select(jobrolldd);
					 drop.selectByIndex(0);
					 iedriver1.findElementById("company").sendKeys("TestLeaf");
					 
					 WebElement countryddn = iedriver1.findElementById("country");
					 Select cntydd = new Select(countryddn);
					 cntydd.selectByVisibleText("India");
					 
					 iedriver1.findElementById("postal_code").sendKeys("600061");
					 
					 iedriver1.findElementById("username").sendKeys("mine@gmail.com");
					 iedriver1.findElementById("eula").click();
					 //iedriver1.findElementById("submit_btn").click();
					 Thread.sleep(3000);
					 iedriver1.close(); // Developer force signup for IE close
					 
					 
					FirefoxDriver iedriver2 = new FirefoxDriver();
					iedriver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
					iedriver2.get("https://developer.salesforce.com");  //Developer force signin for IE
					iedriver2.manage().window().maximize();
					iedriver2.findElementById("login-button").click();
					iedriver2.findElementById("username").sendKeys("myinfo11@gmail.com");
					iedriver2.findElementById("password").sendKeys("TestLeaf@123");
					iedriver2.findElementById("Login").click();
					Thread.sleep(2000);
					iedriver2.close();    //Developer force login in IE closeed 
					System.out.println("Internet Explorer closed"); 
			   }   
			
			        if(i==3)
			       {
			           System.out.println("Initiating Chrome Web Browser"); 
			    	   System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf-Selenium\\drivers\\chromedriver.exe");	   		
			   		   ChromeDriver chrodriver= new ChromeDriver();
			   		   chrodriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   		   chrodriver.manage().window().maximize();
			   		   chrodriver.get("https://irctc.co.in");   //irctc signup in chrome
			   		chrodriver.manage().window().maximize();
			   		chrodriver.findElementByLinkText("Sign up").click();
			   		chrodriver.findElementByName("userName").sendKeys("slat1111");
					WebElement questiondd = chrodriver.findElementByName("question");
					Select quedd = new Select(questiondd);
					quedd.selectByIndex(1);
					chrodriver.findElementByName("answer").sendKeys("pets"); //security ques
					chrodriver.findElementByName("firstName").sendKeys("Siva");
					Thread.sleep(500);
					chrodriver.findElementByName("lastName").sendKeys("Koti");
					WebElement genderdd = chrodriver.findElementByName("gender"); //gender dropdown
					Select gendd = new Select(genderdd);
					gendd.selectByIndex(0);
					WebElement mariagedd = chrodriver.findElementByName("maritalStatus"); //Marital status
					Select mrgdd = new Select(mariagedd);
					mrgdd.selectByIndex(0);
					
					WebElement date = chrodriver.findElementByName("day"); //DOB date
					Select dte = new Select(date);
					dte.selectByIndex(1);
					
					Thread.sleep(500);
					WebElement month = chrodriver.findElementByName("month"); //DOB Month
					Select mntdd = new Select(month);
					mntdd.selectByIndex(10);
					
					Thread.sleep(500);
					
					WebElement yeardd = chrodriver.findElementByName("year"); //DOB Year
					Select year = new Select(yeardd);
					year.selectByValue("1983");
					
					WebElement occupationdd = chrodriver.findElementByName("occupation"); //Occupation
					Select occupation = new Select(occupationdd);
					occupation.selectByIndex(3);
					
					chrodriver.findElementById("aadharCard").sendKeys("412943208725");
					Thread.sleep(500);
					chrodriver.findElementByName("email").sendKeys("myinfo11@gmail.com");
					chrodriver.findElementByName("mobile").sendKeys("8138963295");
					
					WebElement nationalitydd = chrodriver.findElementByName("nationality");
					Select nationality = new Select(nationalitydd);
					nationality.selectByValue("India");
					
					//Res Address
					
					chrodriver.findElementByName("resAddress1").sendKeys("Door no 21, 23th street");
					Thread.sleep(500);
					chrodriver.findElementByName("resAddress2").sendKeys("T G Nagar, Nanganallur");
					chrodriver.findElementByName("resAddress3").sendKeys("Chennai");
					
					WebElement countrydd = chrodriver.findElementByName("resCountry");
					Select country = new Select(countrydd);
					country.selectByValue("India");
					
					chrodriver.findElementById("resPinCode").sendKeys("600061");
					chrodriver.findElementById("resPinCode").sendKeys(Keys.TAB);
					
					
					chrodriver.findElementByName("resPhone").sendKeys("8138964595");
					
					chrodriver.findElementById("rdresyes").click();
					
					chrodriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[1]/td[2]/input[2]").click();
					Thread.sleep(1000);
					chrodriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[2]/td[2]/input[2]").click();
					chrodriver.findElementByXPath("/html/body/form/div/div/div[9]/table/tbody/tr[1]/td[2]/table/tbody[1]/tr/td/table[1]/tbody[2]/tr[3]/td[2]/input[2]").click();
				
					chrodriver.findElementById("resState").click();
					Thread.sleep(500);
					WebElement citydd = chrodriver.findElementById("resCity");
					Select city = new Select(citydd);
					city.selectByIndex(1);
					Thread.sleep(500);
			   		   chrodriver.close();      //irctc chrome signup closed
			   		  
			   		   ChromeDriver chrodriver1= new ChromeDriver();
			   		   chrodriver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   		   chrodriver1.manage().window().maximize();
			   		   chrodriver1.get("https://developer.salesforce.com");  //developer force signup in chrome
			   		//driver.findElementByLinkText("Sign Up").click(); 
			   		chrodriver1.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
			   		chrodriver1.findElementById("first_name").sendKeys("SivaKoti");
			   		chrodriver1.findElementById("last_name").sendKeys("a");
			   		chrodriver1.findElementById("email").sendKeys("mines@gmacil.com");
			   		
			   		 WebElement jobrolldd = chrodriver1.findElementById("job_role");
			   		 
			   		 Select drop = new Select(jobrolldd);
			   		 drop.selectByIndex(0);
			   		chrodriver1.findElementById("company").sendKeys("TestLeaf");
			   		 
			   		 WebElement countrydd3 = chrodriver1.findElementById("country");
			   		 Select cntydd = new Select(countrydd3);
			   		 cntydd.selectByVisibleText("India");
			   		 
			   		chrodriver1.findElementById("postal_code").sendKeys("600061");
			   		 
			   		chrodriver1.findElementById("username").sendKeys("mines@gmacil.com");
			   		chrodriver1.findElementById("eula").click();
			   		//chrodriver1.findElementById("submit_btn").click();
			   		 Thread.sleep(1000);
			   		chrodriver1.close(); //developer force signup in chrome window closing
			   		 
			   		 
			   		FirefoxDriver chrodriver2 = new FirefoxDriver();
			   		chrodriver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   	
			   		chrodriver2.get("https://developer.salesforce.com");  //developer force signin in chrome
			   		chrodriver2.manage().window().maximize();
			   		chrodriver2.findElementById("login-button").click();
			   		chrodriver2.findElementById("username").sendKeys("myinfo11@gmail.com");
			   		chrodriver2.findElementById("password").sendKeys("TestLeaf@123");
			   		chrodriver2.findElementById("Login").click();
			   		Thread.sleep(2000);
			   		chrodriver2.close();  //developer force signedin window close
			   		System.out.println("Chrome Web Browser closed");
			   		   
			       } 
				
		} //for loop close
	}
}
