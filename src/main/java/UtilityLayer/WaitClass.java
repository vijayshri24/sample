package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitClass extends BaseClass {
	
	public static void sendkeys(WebElement web,String value)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
				
			WebElement web1=wait.until(ExpectedConditions.visibilityOf(web));
			
			web1.sendKeys(value);

}
	public static void click(WebElement web)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOf(web));
		
		web1.click();
		
	}
	public static void clear(WebElement web)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(web)).clear();
		
	}
	
	public static String  getTextr(WebElement web,String value)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOf(web));
		
		String a=web1.getText();
		return a;
	
		
	}
	public static String getAtrribute(WebElement web,String keyname)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOf(web));
		
		String a=web1.getAttribute(keyname);
		System.out.println(a);
		return a;
	}
	
	public static boolean isSelected(WebElement web)
	{
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOf(web));
		
		boolean a=web1.isSelected();
		
		return a;
		
	}

}

