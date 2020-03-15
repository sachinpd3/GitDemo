package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SeleniumTest {

	
	

	
	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation() throws IOException
	{
		System.out.println("BrowserAUtomation");
		if (10>2)
		
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\SACHIN\\Desktop\\test.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		workbook.getSheet("test");
		}
		
		
		
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	
	
}
