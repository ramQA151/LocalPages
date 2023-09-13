package com.qa.Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.CrackerBarrel_localPage;

public class CrackerBarrel_localPage_test extends TestBase{
	CrackerBarrel_localPage CBlocal;
	

	public CrackerBarrel_localPage_test() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		CBlocal = new CrackerBarrel_localPage(driver);
		driver.get(prop.getProperty("crackerbarrelLocalPage"));

	}
	@Test(priority = 1)
	public void VerifyShopDetails_test() throws InterruptedException {
		CBlocal.VerifyShopDetails();
	}
	
	@Test(priority = 2)
	public void verifydirectionandhourslist_test() throws InterruptedException {
		CBlocal.verifydirectionandhourslist();
	}
	
	@AfterClass
	public void end()  {
	
		driver.quit();
	}
}
