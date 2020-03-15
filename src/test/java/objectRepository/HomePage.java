package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 

{
  WebDriver driver;
	
	public  HomePage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(By.linkText("Sign in"));
	}
	
	
	public WebElement SearchBox()
	{
		return driver.findElement(By.id("srchword"));
	}
	
	
	public WebElement SearchIcon()
	{
		return driver.findElement(By.className("newsrchbtn"));
	}
	
}