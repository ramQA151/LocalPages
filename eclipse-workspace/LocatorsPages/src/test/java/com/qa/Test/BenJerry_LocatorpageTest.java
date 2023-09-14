package com.qa.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.BenJerry_LocatorPage;

public class BenJerry_LocatorpageTest extends TestBase {
	BenJerry_LocatorPage benJerry_LocatorPage;
	public BenJerry_LocatorpageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {

		initialization();
		benJerry_LocatorPage = new BenJerry_LocatorPage(driver);
		driver.get(prop.getProperty("Benjerry"));

	}
	
	@Test(priority = 1)
	public void VerifyHomePage() throws InterruptedException  {
		benJerry_LocatorPage.VerifyHomePage();
	}

	@Test(priority = 2)
	public void VerifySelectedAddress() throws InterruptedException {
		benJerry_LocatorPage.VerifySelectedAddress();
	}

	@Test(priority = 3)
	public void VerifyAllFoundLocations() throws InterruptedException {
		benJerry_LocatorPage.VerifyAllFoundLocations();
	}

	@Test(priority = 4)
	public void VerifySelectedLocationDetails_StoreName() throws InterruptedException {
		benJerry_LocatorPage.VerifySelectedLocationDetails_StoreName();
	}

	@Test(priority = 5)
	public void VerifySelectedLocationDetails_GetDirections() throws InterruptedException {
		benJerry_LocatorPage.VerifySelectedLocationDetails_GetDirections();
	}

	@Test(priority = 6)
	public void VerifySelectedLocationDetails_StoreHours() throws InterruptedException {
		benJerry_LocatorPage.VerifySelectedLocationDetails_StoreHours();
	}

	@Test(priority = 7)
	public void VerifySelectedLocationDetails_ScoopShopWebsite() throws InterruptedException {
		benJerry_LocatorPage.VerifySelectedLocationDetails_ScoopShopWebsite();
	}

	
	/*
	 * @Test(priority = 8) public void
	 * VerifySelectedLocationDetails_OrderTakeOut()throws InterruptedException {
	 * benJerry_LocatorPage.VerifySelectedLocationDetails_OrderTakeOut(); }
	 */
	 
	 
	
	/*
	 * @AfterClass public void tearDown() throws InterruptedException {
	 * Thread.sleep(3000); driver.quit(); }
	 */
	 
}
