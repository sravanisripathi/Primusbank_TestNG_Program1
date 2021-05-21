package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.Adminhomepage;
import primusbank.library.PrimusBankHomepage;
import utils.Apputils;

public class AdminloginTest extends Apputils
{
	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminlogin(String uid, String pwd)
	{
		
		PrimusBankHomepage phome = new PrimusBankHomepage();
		boolean aresult = phome.adminLogin(uid,pwd);
		Assert.assertTrue(aresult);
	
		Adminhomepage ahome = new Adminhomepage();
		boolean ares = ahome.adminLogout();
		Assert.assertTrue(ares);
		
	
	}
	
	
}
