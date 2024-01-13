package TestLayer;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.registernewuser;

public class RegisterUserTest extends BaseClass {
	@BeforeTest
	public void setup()
	{
		 BaseClass .intialize();
	}
	@Test
	public void validateregisteruser() throws InterruptedException
	{
		 registernewuser register= new registernewuser();
		 
		register.registeruser("Ms.","vijayshri","pawar","kalamb","kalamb","solapur","India","MAHARASHTRA","Indian","411034",
				 "abc2gmail.com","254562", "9874563214","Who is your favorite Hero???","Sahid","vijayshri123","123456","123456");
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}

}
