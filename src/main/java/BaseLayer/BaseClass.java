package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	

	 public static WebDriver driver;
	public static Properties prop;
	
	
	public static  FileInputStream Fis;

	 public BaseClass()
	{
		File F=new File(System.getProperty("user.dir") +"/src/main/java/ConfigutationLayer/con.properties");

	 prop=new Properties();

	try
	{
		Fis=new 	 FileInputStream	(F);
	prop.load(Fis);
						}

	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static  void intialize()
	{
	driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	driver.manage().deleteAllCookies();
	
	String url=prop.getProperty("Url");
	driver.get(url);
	}
	}






