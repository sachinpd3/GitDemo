package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com
public class RESTAPITest {

	@Test
	public ArrayList<String> getData() throws IOException
	{
		
			//fileInputStream argument
			//Set a=new HashSet();
			ArrayList<String> a=new ArrayList<String>();
			
			
			FileInputStream fis=new FileInputStream("C:\\Users\\SACHIN\\Desktop\\test.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);

			int sheets=workbook.getNumberOfSheets();
			for(int i=0;i<sheets;i++)
			{
				
				
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);
			//Identify Testcases coloum by scanning the entire 1st row

			Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
			Row firstrow= rows.next();
			Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
			int k=0;
			int coloumn = 0;

			while(rows.hasNext())
			{

			Row r=rows.next();

			if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("purchase"))
				
			{
				Iterator<Cell> celldata=r.cellIterator();
				
				while (celldata.hasNext())
				{
					Cell data=celldata.next();
					String val=data.getStringCellValue();
					a.add(val);
					//System.out.println(val);
					
				}
				
			}
			}	


			}

			}
			return a;
			}

	
}
