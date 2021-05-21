package primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class PrimusBankHomepage extends Apputils
{

	public boolean adminLogin(String uid, String pwd)
	{	
		String exp,act;
		exp="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		act= driver.getCurrentUrl().toLowerCase();
	
	if(act.contains(exp))
	{
		return true;
		
	}else
	{
		return false;
	}
	}
	
	public boolean bankerLogin(String bname, String uid, String pwd)
	{
		String act, exp;
		exp = "Bankers_flow";
		Select list = new Select(driver.findElement(By.id("drlist")));
		list.selectByVisibleText(bname);
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		act = driver.getCurrentUrl().toLowerCase();
		
		if (act.contains(exp))
		{
			return true;
		}else
		{
			return false;
		}
	
	
}
}
