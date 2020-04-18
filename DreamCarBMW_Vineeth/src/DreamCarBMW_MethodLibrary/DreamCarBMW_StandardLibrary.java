/****************************************

Package Name: DreamCarBMW_MethodLibrary
Method Name:Invoke
Method Description: To invoke the application
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:844666

*******************************************/





package DreamCarBMW_MethodLibrary;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;


public class DreamCarBMW_StandardLibrary {
	public void Invoke(WebDriver obj) throws IOException
	{
		FileReader fr=new FileReader("DreamCar.properties"); //for object repository file
		Properties p=new Properties();
		p.load(fr);//loading a file
		 obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			obj.get(p.getProperty("url"));
			
	}
	}





