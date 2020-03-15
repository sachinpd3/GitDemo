package Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base
{

	public WebDriver driver;
	public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	
	{
		
		Properties prop=new Properties();
		FileInputStream fis =  new FileInputStream("C:\\Users\\SACHIN\\Downloads\\Mavenjava\\Mavenjava\\src\\test\\java\\rediff\\datariven.properties");
		prop.load(fis);

		if (prop.getProperty("Browser").contains("firefox"))
		{
			 driver = new FirefoxDriver();
			 
		}
		
		else if (prop.getProperty("Browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SACHIN\\Desktop\\chromedriver.exe"); 
			driver = new ChromeDriver();	
		}
		else
		{
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SACHIN\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		return driver;
		
		
	}
	
	
	
}
