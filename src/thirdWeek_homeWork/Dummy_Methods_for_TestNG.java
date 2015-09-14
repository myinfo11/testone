package thirdWeek_homeWork;

import org.testng.annotations.Test;

public class Dummy_Methods_for_TestNG {

@Test  //(invocationCount=3)
	public void signup() 
	{
	System.out.println("Signup");	
	}

@Test
	public void login() throws Exception 
	{
	System.out.println("Login");	
	throw new Exception();
	}
	
@Test (dependsOnMethods= {"login"} )
	public void createlead() 
	{
	System.out.println("Create Lead");	
	}

@Test (dependsOnMethods= {"login"} )
	public void createaccount() 
	{
	System.out.println("Create Account");	
	}
	
@Test (enabled = false)
	public void deletelead() 
	{
	System.out.println("Delete Lead");	
	}
	
@Test 
	public void logout() 
	{
	System.out.println("Logout");	
	}

}
