package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninPage 

{
  WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	public WebElement Username()
	{
		return driver.findElement(By.id("login1"));
		
	}
	
	public WebElement Password()
	{
		return driver.findElement(By.id("password"));
		
	}
	
	public WebElement Go()
	{
		return driver.findElement(By.name("proceed"));
		
	}
	
	public WebElement Home()
	{
		return driver.findElement(By.linkText("Home"));
		
	}
	
}