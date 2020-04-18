/****************************************

Package Name:DreamCarBMW_MethodLibrary 
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:844666

*******************************************/







package DreamCarBMW_MethodLibrary;

import java.io.File;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;




import DreamCarBMW_POMRepository.DreamCarBMW_Modelsmenu;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




public class DreamCarBMW_TestLibrary {
	
	
	
	public void DreamCarBMW_Modelsmenu1(WebDriver obj) throws IOException, InterruptedException 
	{
		
		Thread.sleep(2000);
		DreamCarBMW_Modelsmenu.DreamCarBMW_Modelsmenu1(obj).click();//for clicking on models menu
		TakesScreenshot  ts= (TakesScreenshot)obj;//For taking screenshot
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./BMW_FileUtilitiesAndReports/Screenshot1.png"));
	    System.out.println("the Screenshot is taken");
	}
 
public void DreamCarBMW_Series(WebDriver obj) throws IOException 
{
	DreamCarBMW_POMRepository.DreamCarBMW_Series.DreamCarBMW_Series1(obj).click();//for clicking on series
	
	TakesScreenshot ts= (TakesScreenshot)obj;//For taking screenshot
	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./BMW_FileUtilitiesAndReports/Screenshot2.png"));
	 System.out.println("the Screenshot is taken");


}




public void DreamCoverBMW_hover(WebDriver obj) throws IOException, InterruptedException 
{
	Actions actions = new Actions(obj);//hover to the image
	 actions.moveToElement(DreamCarBMW_POMRepository.DreamCarBMW_Series.hover(obj)).perform();
	 obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	DreamCarBMW_POMRepository.DreamCarBMW_Series.find(obj).click();//clicking on find more
	 obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	TakesScreenshot ts= (TakesScreenshot)obj;
	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./BMW_FileUtilitiesAndReports/Screenshot3.png"));
	 System.out.println("the Screenshot is taken");


}
public void DreamCarBMW_Technical(WebDriver obj) throws IOException, InterruptedException, RowsExceededException, WriteException 
{
	

	DreamCarBMW_POMRepository.DreamCarBMW_Technical.tech_click(obj).click();//clicking on technical data
	JavascriptExecutor executor = (JavascriptExecutor)obj;
	executor.executeScript("window.scrollBy(0,500)", "");
	
	String s=DreamCarBMW_POMRepository.DreamCarBMW_Technical.speed(obj).getText();
	
	
	int i= Integer.parseInt(s);
	if(i<500){
		String msg="Does not meet my requirement";
		String srcfile="./BMW_FileUtilitiesAndReports/speed.xls";
		WritableWorkbook myFirstWbook=null;
		myFirstWbook = Workbook.createWorkbook(new File(srcfile));
		WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);
		
		Label label= new Label (0,0,msg);
		excelSheet.addCell(label);
		
		myFirstWbook.write();
		myFirstWbook.close();
	}
	
		TakesScreenshot ts= (TakesScreenshot)obj;
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./BMW_FileUtilitiesAndReports/Screenshot5.png"));
		 System.out.println("the Screenshot is taken");

	}


public void end(WebDriver obj)
{
	obj.close();
}

}











