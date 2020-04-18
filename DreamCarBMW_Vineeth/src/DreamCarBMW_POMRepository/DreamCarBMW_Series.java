/****************************************

Package Name:DreamCarBMW_POMRepository
Method Name:DreamCarBMW_Series
Method Description: DreamCarBMW_Series1, moving to hover,find out more
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:844666

*******************************************/
package DreamCarBMW_POMRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DreamCarBMW_Series {
private static WebElement el=null;
	
	public static WebElement DreamCarBMW_Series1(WebDriver driver)
	{
		el=driver.findElement(By.xpath("//a [contains(text(),'7')]"));//xpath for series 7
	return el;
	}

			
			
			public static WebElement hover(WebDriver driver)
			{
				el=driver.findElement(By.xpath("//div[@class='lg:tw-w-1/4 sm:tw-w-1/2 tw-w-full tw-relative']"));//x-path for moving to hover
				
			return el;
		}
			
			public static WebElement find(WebDriver driver)
			{
				el=driver.findElement(By.linkText(("Find out more")));//x-path for find out more
			return el;
			
		}
			
}		

	




