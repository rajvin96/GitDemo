/****************************************

Package Name:DreamCarBMW_Script
Method Name:DreamCarBMW_MainScript1
Method Description: For calling the diffrent functions
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:844666

*******************************************/
package DreamCarBMW_Script;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import DreamCarBMW_MethodLibrary.DreamCarBMW_StandardLibrary;
import DreamCarBMW_MethodLibrary.DreamCarBMW_TestLibrary;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class DreamCarBMW_MainScript1 {
WebDriver obj=new ChromeDriver();
	//WebDriver obj=new FirefoxDriver();
  @Test
  public void f() throws IOException, BiffException, InterruptedException, RowsExceededException, WriteException {
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\com\\Desktop\\Selenium-latest\\Drivers\\geckodriver.exe");
	  DreamCarBMW_StandardLibrary obj1=new DreamCarBMW_StandardLibrary();
	  obj1.Invoke(obj);//invoking the dreamCarBMW
	 
	  DreamCarBMW_TestLibrary obj2= new DreamCarBMW_TestLibrary();
	  obj2.DreamCarBMW_Modelsmenu1(obj);//calls the  models menu
	  obj2.DreamCarBMW_Series(obj);//calls the series7
	  obj2.DreamCoverBMW_hover(obj);	//hover is called
	  obj2.DreamCarBMW_Technical(obj);//technical data function is called
	  obj2.end(obj);
	 
	    
  }
}

