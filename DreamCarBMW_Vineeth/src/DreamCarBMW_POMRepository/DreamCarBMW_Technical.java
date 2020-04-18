/****************************************

Package Name:DreamCarBMW_POMRepository
Method Name:DreamCarBMW_Technical ,speed
Method Description:  xpath for Technical data and speed
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:844666

*******************************************/
package DreamCarBMW_POMRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DreamCarBMW_Technical {
private static WebElement el=null;
	
	public static WebElement tech_click(WebDriver driver)
	{
		el=driver.findElement(By.linkText(("Technical Data"))); // technical data by link text
	    return el;
	
	}
	
	public static WebElement speed(WebDriver driver)
	{
		el=driver.findElement((By.xpath("//section[contains(@class,'content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active')]//div[contains(@class,'show-for-medium-up')]//div[2]//div[1]//table[1]//tbody[1]//tr[1]//td[2]//div[1]")));//x-path for speed
		return el;
	}
	

}



