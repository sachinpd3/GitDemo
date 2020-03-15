package rediff;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Driver.Base;
import objectRepository.HomePage;
import objectRepository.SearchPage;
import objectRepository.SigninPage;

public class TestCase extends Base
{

	private static final TimeUnit SECONDS = null;
	private static final Object String = null;
 
	@Parameters({"Test"})
	@Test
	public  void TestCase (String Test) throws IOException
	
	{
		WebDriver driver=null;	
		FileInputStream fisexcel=new FileInputStream("C:\\Users\\SACHIN\\Desktop\\Test.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fisexcel);
		Sheet worksheet=workbook.getSheet("testdata");
	int	rowcount=worksheet.getLastRowNum()-worksheet.getFirstRowNum();
	for(int i=1;i<rowcount+1;i++)
	{
		
	Row	rowsheet=worksheet.getRow(i);
	
	if (rowsheet.getCell(0).getStringCellValue().equals(Test))
		
	{
		System.out.println(rowsheet.getCell(0).getStringCellValue());
		
		System.out.println(rowsheet.getCell(1).getStringCellValue());
		
		System.out.println(rowsheet.getCell(2).getStringCellValue());
		
		System.out.println(rowsheet.getCell(3).getStringCellValue());
		
		
		driver=InitializeDriver();
		
	
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		//driver.get("https://www.rediff.com/");
		HomePage hp = new HomePage(driver);
		
		hp.SignIn().click();
		
		SigninPage sp = new SigninPage(driver);
		
		sp.Username().sendKeys(rowsheet.getCell(1).getStringCellValue());
		
		sp.Password().sendKeys(rowsheet.getCell(2).getStringCellValue());
		
		sp.Go().click();
		
		sp.Home().click();
		
		hp.SearchBox().sendKeys(rowsheet.getCell(3).getStringCellValue());
		
		hp.SearchIcon().click();
		
		SearchPage scp = new SearchPage(driver);
		
		Select s = new Select (scp.SortBy());
		
		s.selectByValue(rowsheet.getCell(3).getStringCellValue()+"/sort-2");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(scp.FirstMobile()));
		
		//driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		
		scp.FirstMobile().click();
		
		
		driver.quit();
		}
		
	}
	}
		
}


