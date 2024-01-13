package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class register extends BaseClass{
	
	@FindBy(name="firstname")
	private WebElement name;

	
	@FindBy(name="lastname")
	private WebElement lname;

	
	@FindBy(name="reg_email__")
	private WebElement email;

	
	@FindBy(name="reg_passwd__")
	private WebElement pass;

	
	@FindBy(name="birthday_day")
	private WebElement day;

	
	@FindBy(name="birthday_month")
	private WebElement month;

	
	@FindBy(name="birthday_year")
	private WebElement year;

	
	@FindBy(name="fgender_wrapper")
	private WebElement gender;

	
	public register()
	{
		PageFactory.initElements(driver,this);
	}
	public void  registeruser(String fname,String lastname,String Email,String  password,String Day,String Month,String Year)
	{
		
	}

}
