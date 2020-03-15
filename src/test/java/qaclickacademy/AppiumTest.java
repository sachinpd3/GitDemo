package qaclickacademy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

//import DataDriven.FrameworkTest;

public class AppiumTest {
	@Test
	public void NativeAPpAndroid() throws IOException
	
	{
		
		RESTAPITest d =new RESTAPITest();
		
		ArrayList<String>data=d.getData();
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		
		System.out.println(data.get(4));
		System.out.println(data.get(5));
		System.out.println(data.get(6));
		System.out.println(data.get(7));
		
		
		
	}
	
}
