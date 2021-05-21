package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.Bankershomepage;
import primusbank.library.PrimusBankHomepage;
import utils.Apputils;

public class Bankerlogintest extends Apputils
{
@Parameters({"bname","uid","pwd"})
@Test

	public void checkBankerlogin (String bname, String uid, String pwd)
	
	{
		PrimusBankHomepage phome = new PrimusBankHomepage();
		boolean res = phome.bankerLogin(bname, uid, pwd);
		
		//Assert.assertTrue(res);
		
		Bankershomepage bhome= new Bankershomepage();
		boolean result = bhome.bankerLogout();
		
		//Assert.assertTrue(result);
	}
	
}
