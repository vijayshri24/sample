package PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Handledropdown;
import UtilityLayer.WaitClass;

public class registernewuser extends BaseClass{
	
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtFName")
	private WebElement name;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtLName")
	private WebElement lname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement add;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress2")
	private WebElement add2;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nationality;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pin;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPhoneNumber")
	private WebElement pno;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mob;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlQuestions")
	private WebElement que;
	
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAnswer")
	private WebElement ans;
	
	
	@FindBy(name="ctl00_ContentPlaceHolder1_rdoGeneral")
	private WebElement radiobtn;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtUserId")
	private WebElement uname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")
	private WebElement pass;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")
	private WebElement cpass;
	
	
	public registernewuser()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registeruser(String Title,String firstname,String lastname,String address,String address1,String City,String Country,
			
			String State,String Nationality,String pincode,String Email,String phone,String mobile,String question,String answer,
			
			String username,String password,String cpassword) 
	{
		
		Handledropdown.selectByVisibleText(title,Title);
		WaitClass.sendkeys(name, firstname);
		WaitClass.sendkeys(lname,lastname);
		
		WaitClass.sendkeys(add, address);
		WaitClass.sendkeys(add2,  address1);
		
		WaitClass.sendkeys(city,City);
		Handledropdown.selectByVisibleText(country,Country);
		
		Handledropdown.selectByVisibleText(state,State);
		
		WaitClass.sendkeys(nationality,Nationality);
		
		WaitClass.sendkeys( pin,pincode);
		WaitClass.sendkeys(email, Email);
		
		WaitClass.sendkeys(pno, phone);
		
		WaitClass.sendkeys(mob, mobile);
		Handledropdown.selectByVisibleText(que, question);
		
		WaitClass.sendkeys(ans, answer);
		
		//WaitClass.click(radiobtn);
		
		WaitClass.sendkeys(uname, username);
		
		//WaitClass.sendkeys(uname,username);
		WaitClass.sendkeys(pass, password);
		WaitClass.sendkeys(cpass, cpassword);
		
	
		
	}
}
