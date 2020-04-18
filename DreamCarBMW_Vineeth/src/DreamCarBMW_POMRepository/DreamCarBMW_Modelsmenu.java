/****************************************

Package Name:DreamCarBMW_POMRepository
Method Name:DreamCarBMW_Modelsmenu
Method Description: ModelMenu
Date Of Creation:12.03.2020
Author Name:Gyanvi Singh
Employee ID:

*******************************************/
package DreamCarBMW_POMRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DreamCarBMW_Modelsmenu {
private static WebElement el=null;
	
	public static WebElement DreamCarBMW_Modelsmenu1(WebDriver driver)
	{
		el=driver.findElement(By.xpath("//a[contains(text(),'Models')]"));
	    return el;
	
	}
}
