package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage 

{
  WebDriver driver;
	
	public  SearchPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
	
	public WebElement SortBy()
	{
		return driver.findElement(By.name("sorting"));
	}
	
	
	public WebElement FirstMobile()
	{
		return driver.findElement(By.xpath( "//*[@id='catmore_0']/child::div[2]"));
	}
	
	
	
}