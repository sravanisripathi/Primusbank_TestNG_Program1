package primusbank.library;

import org.openqa.selenium.By;
import utils.Apputils;

public class Bankershomepage extends Apputils 
{
	
		public boolean bankerLogout()
		{
			driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']")).click();
			if(driver.findElement(By.id("login")).isDisplayed())
			{
				return true;
			
			}else 
			{
				return false;
			}
			
		}
}
		
	